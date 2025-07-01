package org.eci.calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
@CrossOrigin(origins = "*")
public class CalculatorController {

    @PostMapping
    public ResponseEntity<CalculationResponse> calculate(@RequestBody CalculationRequest request) {
        try {
            Expression expression = new ExpressionBuilder(request.getExpression()).build();
            double result = expression.evaluate();
            return ResponseEntity.ok(new CalculationResponse(result));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
