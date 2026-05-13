package aula04;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class datetime {
    static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("\nData: "+dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora: "+horaAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora: "+dataHoraAtual+"\n");
    }
}

