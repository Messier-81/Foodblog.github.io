package com.example.simpledms.controller;

import com.example.simpledms.model.ChineseFood;
import com.example.simpledms.service.ChineseFoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * packageName : com.example.jpaexam.controller.exam07
 * fileName : CustomerController
 * author : ds
 * date : 2022-10-21
 * description : 고객 컨트롤러 쿼리 메소드
 * 요약 :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-21         ds          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class ChineseFoodController {

    @Autowired
    ChineseFoodService chineseFoodService; // @Autowired : 스프링부트가 가동될때 생성된 객체를 하나 받아오기

    @GetMapping("/chineseFood")
    public ResponseEntity<Object> getChineseFoodAll(@RequestParam(required = false) String email,
                                             @RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "3") int size
    ) {

        try {
//            Pageable 객체 정의 ( page, size 값 설정 )
            Pageable pageable = PageRequest.of(page, size);

//            Page 객체 정의
            Page<ChineseFood> chineseFoodPage;

//            findAll() 생략 해도 전체검색이 됨 :
//            why? like 검색시 고객명 매개변수가 ""이더라도 전체검색이 됨
            chineseFoodPage = chineseFoodService.findAllByDnameContaining(email, pageable);

//            맵 자료구조에 넣어서 전송
            Map<String, Object> response = new HashMap<>();
            response.put("chineseFood", chineseFoodPage.getContent());
            response.put("currentPage", chineseFoodPage.getNumber());
            response.put("totalItems", chineseFoodPage.getTotalElements());
            response.put("totalPages", chineseFoodPage.getTotalPages());

            if (chineseFoodPage.isEmpty() == false) {
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/chineseFood/all")
    public ResponseEntity<Object> removeAll() {

        try {
            chineseFoodService.removeAll();

            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/chineseFood")
    public ResponseEntity<Object> createChineseFood(@RequestBody ChineseFood chineseFood) {

        try {
            ChineseFood chineseFood2 = chineseFoodService.save(chineseFood);

            return new ResponseEntity<>(chineseFood2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/chineseFood/{cno}")
    public ResponseEntity<Object> getChineseFoodId(@PathVariable int cno) {

        try {
            Optional<ChineseFood> optionalChineseFood = chineseFoodService.findById(cno);

            if (optionalChineseFood.isPresent() == true) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(optionalChineseFood.get(), HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/chineseFood/{cno}")
    public ResponseEntity<Object> updateChineseFood(@PathVariable int cno,
                                            @RequestBody ChineseFood chineseFood) {

        try {
            ChineseFood chineseFood2 = chineseFoodService.save(chineseFood);

            return new ResponseEntity<>(chineseFood2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping ("/chineseFood/deletion/{cno}")
    public ResponseEntity<Object> deleteChineseFood(@PathVariable int cno) {

        try {
            boolean bSuccess = chineseFoodService.removeById(cno);

            if (bSuccess == true) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}










