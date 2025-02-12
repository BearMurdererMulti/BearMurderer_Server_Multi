package com.server.bearmurderermulti.domain.dto.chat;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatListRequest {

    private String nickName;
    private String aiNpcName;
    private Long gameSetNo;

}
