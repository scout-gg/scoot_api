Feature: Buildings

  Scenario: All buildings should return 200 OK
    Given url baseUrl
    And path 'buildings'
    When method get
    Then status 200

  Scenario: Blacksmith contains costs, stats, buildings, techs ...
    Given url baseUrl
    And path 'buildings/103'
    When method get
    Then status 200
    * def cost =
    """
    {
      cost: {
        woodCost: 150,
        foodCost: 0,
        goldCost: 0,
        stoneCost: 0
        }
    }
    """
    * match response contains  cost
    * def stats =
    """
    {
      stats: {
        attack: 0,
        meleeArmor: 0,
        pierceArmor: 1000,
        hitPoints: 1800,
        lineOfSight: 6,
        garrisonCapacity: 0
      }
    }
    """
    * match response contains stats
    * match response.techs[*].name == [ "Padded Archer Armor", "Forging", "Scale Barding Armor", "Scale Mail Armor", "Fletching"]
    * match response.buildings[*].name == [ "Siege Workshop"]
    * match response.enabledForCivilizations == allCivilizations