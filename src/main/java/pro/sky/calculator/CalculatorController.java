package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {


  private final CalculatorService calculatorService;

  public CalculatorController(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  @GetMapping
  public String helloCalculator() {
    return calculatorService.helloCalculator();
  }

  @GetMapping("/plus")
  public String plus(@RequestParam("num1") int num1,
      @RequestParam("num2") int num2) {
    var rezult = calculatorService.plus(num1, num2);
    return num1 + " + " + num2 + " = " + rezult;
  }

  @GetMapping("/minus")
  public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
    var rezult = calculatorService.minus(num1, num2);
    return num1 + " - " + num2 + " = " + rezult;
  }

  @GetMapping("/multiply")
  public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
    var rezult = calculatorService.multiply(num1, num2);
    return num1 + " * " + num2 + " = " + rezult;
  }

  @GetMapping("/divide")
  public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
    var rezult = calculatorService.divide(num1,num2);
    if (num2 == 0) {
      return "Ошибка,делить на ноль нельзя";
    }
    return num1 + " / " + num2 + " = " + rezult;
  }


}




