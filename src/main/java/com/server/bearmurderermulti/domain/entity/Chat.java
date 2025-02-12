package com.server.bearmurderermulti.domain.entity;

import com.server.bearmurderermulti.domain.enum_class.ChatRoleType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Chat extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String receiver;

    @Enumerated(EnumType.STRING)
    private ChatRoleType receiverType;

    private String sender;

    @Enumerated(EnumType.STRING)
    private ChatRoleType senderType;

    private String chatContent;

    @Column(name = "chat_date")
    private LocalDateTime chatDate;

    @Column(name = "chat_day")
    // 대화했던 게임 일차
    private int chatDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_set_no")
    private GameSet gameSet;

}
