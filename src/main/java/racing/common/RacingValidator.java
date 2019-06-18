package racing.common;

import spark.utils.StringUtils;

public class RacingValidator {
    public static boolean isValidCarNames(String carNames) {
        if (StringUtils.isEmpty(carNames)) {
            return false;
        }
        if (!isInCarCountRange(carNames.split(RacingSettings.CAR_NAME_SEPARATOR.getStr()).length)) {
            return false;
        } 
        
        return true;
    }
    
    public static boolean isInCarCountRange(int carCount) {
        return RacingSettings.MIN_CAR_COUNT.getValue() <= carCount && RacingSettings.MAX_CAR_COUNT.getValue() >= carCount;
    }
    
    public static boolean isInTimeRange(int time) {
        return RacingSettings.MIN_TIME.getValue() <= time && RacingSettings.MAX_TIME.getValue() >= time;
    }
}
