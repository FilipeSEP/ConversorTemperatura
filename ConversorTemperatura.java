import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🌡️ CONVERSOR DE TEMPERATURA 🌡️");
        System.out.println("===============================");
        
        System.out.println("\nEscolha a conversão:");
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.println("3. Celsius → Kelvin");
        System.out.println("4. Kelvin → Celsius");
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();
        double temperatura, resultado;
        
        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura * 9/5) + 32;
                System.out.printf("🌡️ %.1f°C = %.1f°F\n", temperatura, resultado);
                break;
                
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura - 32) * 5/9;
                System.out.printf("🌡️ %.1f°F = %.1f°C\n", temperatura, resultado);
                break;
                
            case 3:
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = temperatura + 273.15;
                System.out.printf("🌡️ %.1f°C = %.1fK\n", temperatura, resultado);
                break;
                
            case 4:
                System.out.print("Digite a temperatura em Kelvin: ");
                temperatura = scanner.nextDouble();
                resultado = temperatura - 273.15;
                System.out.printf("🌡️ %.1fK = %.1f°C\n", temperatura, resultado);
                break;
                
            default:
                System.out.println("❌ Opção inválida!");
        }
        
        scanner.close();
    }
}