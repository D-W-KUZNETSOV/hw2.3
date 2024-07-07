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
  public String plus(@RequestParam int num1,
      @RequestParam int num2) {

    return calculatorService.plus(num1,num2);
  }

  @GetMapping("/minus")
  public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
    return calculatorService.minus(num1,num2);
  }

  @GetMapping("/multiply")
  public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
    return calculatorService.multiply(num1,num2);
  }

  @GetMapping("/divide")
  public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
    return calculatorService.divide(num1,num2);
  }


}




