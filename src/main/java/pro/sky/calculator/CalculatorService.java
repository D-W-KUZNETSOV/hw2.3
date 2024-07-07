package pro.sky.calculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {


  public String helloCalculator() {
    return "Добро пожаловать в калькулятор";
  }


  public String plus(double num1, double num2) {

    double rezult = num1 + num2;
    return num1 + " + " + num2 + " = " + rezult;

  }


  public String minus(double num1, double num2) {
    double rezult = num1 - num2;
    return num1 + " - " + num2 + " = " + rezult;
  }


  public String multiply(double num1, double num2) {
    double rezult = num1 * num2;
    return num1 + " * " + num2 + " = " + rezult;
  }


  public String divide(double num1, double num2) {

    if (num2 != 0) {
      double rezult = num1 / num2;
      return num1 + " / " + num2 + " = " + rezult;
    } else {
      return "Ошибка,делить на ноль нельзя";
    }


  }
}
