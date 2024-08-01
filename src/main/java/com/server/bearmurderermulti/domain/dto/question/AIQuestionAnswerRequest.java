package com.server.bearmurderermulti.domain.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AIQuestionAnswerRequest {

    private int gameNo;
    private String npcName;
    private Integer questionIndex;
    private String keyword;
    private String keywordType;

}
