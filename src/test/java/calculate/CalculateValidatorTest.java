package calculate;

import static calculate.CalculateValidator.*;
import static calculate.ErrorMessage.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculateValidatorTest {
    @Test
    void calculableStringFailTest() {
        assertThatIllegalArgumentException()
          .isThrownBy(() -> checkCalculable("2 + 3 * 4 /"))
          .withMessage(INCORRECT_END_CHARACTER.getMessage());
    
        assertThatIllegalArgumentException()
          .isThrownBy(() -> checkCalculable("2 + a * 4 / 1"))
          .withMessage(INCORRECT_NUMBER.getMessage());
    
        assertThatIllegalArgumentException()
          .isThrownBy(() -> checkCalculable("2 + 3 * 4 ? 2"))
          .withMessage(INCORRECT_MATH_SIGN.getMessage());
    
        assertThatIllegalArgumentException()
          .isThrownBy(() -> checkCalculable("2 + 3*4 + 2"))
          .withMessage(INCORRECT_NUMBER.getMessage());
    }
}
