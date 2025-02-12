package com.server.bearmurderermulti.domain.dto.interrogation;

import com.server.bearmurderermulti.domain.entity.GameSet;
import com.server.bearmurderermulti.domain.entity.Interrogation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterrogationStartRequest {

    private Long gameSetNo;
    private String npcName;
    private String weapon;

    public Interrogation toEntity(GameSet gameSet) {
        return Interrogation.builder()
                .npcName(this.npcName)
                .weapon(this.weapon)
                .gameSet(gameSet)
                .build();
    }

}
