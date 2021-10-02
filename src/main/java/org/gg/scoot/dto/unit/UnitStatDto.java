package org.gg.scoot.dto.unit;

public record UnitStatDto(Integer attack,
                          Integer meleeArmor,
                          Integer pierceArmor,
                          Integer hitPoints,
                          Integer lineOfSight,
                          Integer garrisonCapacity) {
}
