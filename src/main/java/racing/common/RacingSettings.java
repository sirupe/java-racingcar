package racing.common;

public enum RacingSettings {
    MAX_CAR_COUNT(10),
    MAX_TIME(50),
    MIN_CAR_COUNT(1),
    MIN_TIME(1),
    MAX_RANDOM_MOVABLE_NUMBER(9),
    MIN_MOVABLE_NUMBER(4),
    MOVING_START_COUNT(0),
    LEADER_INDEX(0),
    CAR_NAME_SEPARATOR(","),
    CAR_STATUS_SEPARATOR(" : "),
    CAR_MOVING_SIGN("-");

    private int value;
    private String str;
    
    RacingSettings(int value) {
        this.value = value;
    }
    
    RacingSettings(String str) {
        this.str = str;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getStr() {
        return str;
    }
}
