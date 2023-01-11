package guru.springframework;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dollar {

    private int amount;

    public void times(int multiplier)
    {
        this.amount *= multiplier;
    }

}
