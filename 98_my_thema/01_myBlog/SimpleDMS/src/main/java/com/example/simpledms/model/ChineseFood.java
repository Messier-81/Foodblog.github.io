package com.example.simpledms.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

/**
 * packageName : com.example.simpledms.model
 * fileName : KoreaFood
 * author : ds
 * date : 2022-11-22
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-22         ds          최초 생성
 */
@Entity
@Table(name = "TB_CHINESEFOOD")
@SequenceGenerator(
        name= "SQ_CHINESEFOOD_GENERATOR"
        , sequenceName = "SQ_CHINESEFOOD"
        , initialValue = 1
        , allocationSize = 1
)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql="UPDATE TB_CHINESEFOOD SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE CNO = ?")
public class ChineseFood extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_CHINESEFOOD_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
    private Integer cno;

    @Column(columnDefinition = "VARCHAR2(255)")
    private String title;

    @Column(columnDefinition = "VARCHAR2(255)")
    private String email;

    @Column(columnDefinition = "VARCHAR2(255)")
    private String phone;
}
