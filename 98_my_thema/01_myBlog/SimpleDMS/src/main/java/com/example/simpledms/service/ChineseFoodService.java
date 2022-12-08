package com.example.simpledms.service;

import com.example.simpledms.model.ChineseFood;
import com.example.simpledms.model.KoreaFood;
import com.example.simpledms.repository.ChineseFoodRepository;
import com.example.simpledms.repository.KoreaFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : com.example.jpaexam.service.exam01
 * fileName : CustomerService
 * author : ds
 * date : 2022-10-20
 * description : 고객 업무 서비스 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Service
public class ChineseFoodService {

    @Autowired
    ChineseFoodRepository chineseFoodRepository; // JPA CRUD 함수가 있는 인터페이스

    //    전체 조회 함수 findAll() ->(변경) findAll(Pageable pageable)
    public Page<ChineseFood> findAll(Pageable pageable) {
        Page<ChineseFood> page = chineseFoodRepository.findAll(pageable);

        return page;
    }

    //    전체 삭제 함수
    public void removeAll() {
        chineseFoodRepository.deleteAll(); // 전체 삭제
    }

    //   고객 정보 저장/수정 함수
    public ChineseFood save(ChineseFood chineseFood) {

        ChineseFood chineseFood2 = chineseFoodRepository.save(chineseFood);

        return chineseFood2;
    }

    //    고객번호로 조회하는 함수
    public Optional<ChineseFood> findById(int cno) {
//        findById(기본키속성)
        Optional<ChineseFood> optionalChineseFood = chineseFoodRepository.findById(cno);

        return optionalChineseFood;
    }

    // 고객번호(cno)로 삭제하는 함수
    public boolean removeById(int cno) {
//        existsById(기본키) 있으면 삭제 실행 + true 리턴
        if(chineseFoodRepository.existsById(cno) == true) {
            chineseFoodRepository.deleteById(cno);
            return true;
        }

//        없으면 그냥 false 리턴
        return false;
    }

    //    email like 검색 함수( 페이징 처리 추가 )
    public Page<ChineseFood> findAllByDnameContaining(String email, Pageable pageable) {
        Page<ChineseFood> page = chineseFoodRepository.findAllByEmailContaining(email, pageable);

        return page;
    }
}









