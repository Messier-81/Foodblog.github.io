package com.example.simpledms.helper;

import com.example.simpledms.model.Dept;
import com.example.simpledms.model.Dept;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeptExcelHelper {
//  엑셀 타입 : .xls(과거), .xlsx(최신)
//  아래 엑셀타입 : .xlsx 타입
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
//  엑셀 문서에 제목부분
//  Todo: 컬럼 수정 필요
  static String[] HEADERs = { "Dno", "Dname", "Loc" };
  //  Todo: 파일명 수정 필요
  static String SHEET = "Dept";

//  엑셀 인지 아닌지 체크하는 함수
  public static boolean hasExcelFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  //  Todo: Tutorial -> Dept 수정 필요
//  Todo: tutorials -> deptList 수정 필요
//  Tutorial 테이블 데이터 -> 엑셀로 변환하는 함수
  public static ByteArrayInputStream deptsToExcel(List<Dept> deptList) {

//    변형 try(파일입출력){} ~ catch{} : 파일입출력의 마지막 .close() 자동 실행시켜줌
    try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
//      엑셀 워크북 ( 시트들 )
      Sheet sheet = workbook.createSheet(SHEET);

      // Header
      Row headerRow = sheet.createRow(0);

//      제목 4개 반복문 이용해서 엑셀에 출력
      for (int col = 0; col < HEADERs.length; col++) {
        Cell cell = headerRow.createCell(col);
        cell.setCellValue(HEADERs[col]);
      }

      int rowIdx = 1;
//  Todo: Tutorial -> Dept 수정 필요
//  Todo: tutorials -> deptList 수정 필요
//  Todo: tutorial -> dept 수정 필요
//  Todo: dept 객체의 getter 수정 필요
//      엑셀에 데이터를 출력하는 부분
      for (Dept dept : deptList) {
        Row row = sheet.createRow(rowIdx++);

//        테이블 데이터 컬럼 -> 엑셀 셀의 컬럼 변환
        row.createCell(0).setCellValue(dept.getDno());
        row.createCell(1).setCellValue(dept.getDname());
        row.createCell(2).setCellValue(dept.getLoc());
      }

      workbook.write(out); // 엑셀에 반영
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
    }
  }

  //  Todo: Tutorial -> Dept 수정 필요
//  Todo: tutorials -> deptList 수정 필요
//  엑셀 데이터 -> Tutorial 테이블에 데이터 생성
  public static List<Dept> excelToDepts(InputStream is) {
    try {
//      엑셀 워크북 생성
      Workbook workbook = new XSSFWorkbook(is);

//      엑셀 시트 호출
      Sheet sheet = workbook.getSheet(SHEET);
      Iterator<Row> rows = sheet.iterator();

      List<Dept> deptList = new ArrayList<>();

      int rowNumber = 0;
//      여러 엑셀의 행을 -> 테이블의 행으로 생성하는 부분
//      여러 행을 반복하는 부분(행 반복)
      while (rows.hasNext()) {
        Row currentRow = rows.next();

        // skip header( 제목 스킵 )
        if (rowNumber == 0) {
          rowNumber++;
          continue;
        }

//        여러 열을 선택
//        Iterator 객체 : for/while 반복문을 편하게 실행하기 위해 사용.
//        .hasNext() : 배열안에 0 ~ n번 데이터가 있으면 배열의 끝에 도달했는지 여부를 알기위해 호출
//             return 값 : 다음 데이터가 있으면 true, 없으면 false
//        .next() : 다음데이터를 가져오기 함수
        Iterator<Cell> cellsInRow = currentRow.iterator();

//  Todo: Tutorial -> Dept 수정 필요
//  Todo: tutorial -> dept 수정 필요
//  Todo: tutorials -> deptList 수정 필요
//        Tutorial 객체 생성
        Dept dept = new Dept();

        int cellIdx = 0;
//        엑셀 셀(열) 데이터를 Tutorial 테이블에 데이터 한 행을 생성하는 부분(열 반복)
        while (cellsInRow.hasNext()) {
          Cell currentCell = cellsInRow.next();

          switch (cellIdx) { // 엑셀의 인덱스 번호( 0 (A), 1 (B), 2(C) ... )

//  Todo: dept 객체의 setter 수정 필요
//            0번 열
          case 0:
            dept.setDname(currentCell.getStringCellValue());
            break;

//            1번 열
          case 1:
            dept.setLoc(currentCell.getStringCellValue());
            break;

          default:
            break;
          }

          cellIdx++;
        }

//  Todo: tutorials -> deptList 수정 필요
//  Todo: tutorial -> dept 수정 필요
        deptList.add(dept); // 한 행을 객체에 배열로 추가
      }

      workbook.close();

//  Todo: tutorials -> deptList 수정 필요
      return deptList;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
    }
  }
}
