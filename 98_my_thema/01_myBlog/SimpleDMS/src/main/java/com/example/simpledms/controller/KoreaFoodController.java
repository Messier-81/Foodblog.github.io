package com.example.simpledms.controller;

import com.example.simpledms.model.Customer;
import com.example.simpledms.model.KoreaFood;
import com.example.simpledms.service.CustomerService;
import com.example.simpledms.service.KoreaFoodService;
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
public class KoreaFoodController {

    @Autowired
    KoreaFoodService koreaFoodService; // @Autowired : 스프링부트가 가동될때 생성된 객체를 하나 받아오기

    @GetMapping("/koreaFood")
    public ResponseEntity<Object> getKoreaFoodAll(@RequestParam(required = false) String email,
                                             @RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "3") int size
    ) {

        try {
//            Pageable 객체 정의 ( page, size 값 설정 )
            Pageable pageable = PageRequest.of(page, size);

//            Page 객체 정의
            Page<KoreaFood> koreaFoodPage;

//            findAll() 생략 해도 전체검색이 됨 :
//            why? like 검색시 고객명 매개변수가 ""이더라도 전체검색이 됨
            koreaFoodPage = koreaFoodService.findAllByDnameContaining(email, pageable);

//            맵 자료구조에 넣어서 전송
            Map<String, Object> response = new HashMap<>();
            response.put("koreaFood", koreaFoodPage.getContent());
            response.put("currentPage", koreaFoodPage.getNumber());
            response.put("totalItems", koreaFoodPage.getTotalElements());
            response.put("totalPages", koreaFoodPage.getTotalPages());

            if (koreaFoodPage.isEmpty() == false) {
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/koreaFood/all")
    public ResponseEntity<Object> removeAll() {

        try {
            koreaFoodService.removeAll();

            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/koreaFood")
    public ResponseEntity<Object> createKoreaFood(@RequestBody KoreaFood koreaFood) {

        try {
            KoreaFood koreaFood2 = koreaFoodService.save(koreaFood);

            return new ResponseEntity<>(koreaFood2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/koreaFood/{kno}")
    public ResponseEntity<Object> getKoreaFoodId(@PathVariable int kno) {

        try {
            Optional<KoreaFood> optionalKoreaFood = koreaFoodService.findById(kno);

            if (optionalKoreaFood.isPresent() == true) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(optionalKoreaFood.get(), HttpStatus.OK);
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

    @PutMapping("/koreaFood/{kno}")
    public ResponseEntity<Object> updateKoreaFood(@PathVariable int kno,
                                            @RequestBody KoreaFood koreaFood) {

        try {
            KoreaFood koreaFood2 = koreaFoodService.save(koreaFood);

            return new ResponseEntity<>(koreaFood2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping ("/koreaFood/deletion/{kno}")
    public ResponseEntity<Object> deleteKoreaFood(@PathVariable int kno) {

        try {
            boolean bSuccess = koreaFoodService.removeById(kno);

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










