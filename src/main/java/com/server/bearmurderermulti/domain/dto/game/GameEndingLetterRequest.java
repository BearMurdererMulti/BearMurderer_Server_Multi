package com.server.bearmurderermulti.domain.dto.game;

import com.server.bearmurderermulti.domain.enum_class.GameResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameEndingLetterRequest {

    private Long gameSetNo;
    private GameResult gameResult;

}
