package vn.techmaster.basicthymeleaf.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SumRequest {
    private int numberA;
    private int numberB;
    
}
