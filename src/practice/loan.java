package practice;
//Calcular el monto total del préstamo
//Generar un programa que retorne por consola el monto total que se pagará al banco.
//        El monto total es Capital Solicitado + intereses a pagar.
//        La fórmula para calcular "cuánto interés se pagará" por un préstamo pedido al banco es:
//        Interés a pagar = Capital solicitado x Interés x periodo en meses
public class loan {
    public static void main(String[] args) {
        //loan details
        double requestedCapital = 55500;
        double interest = 7.5;
        int periodInMonths = 12;

        //interest payable calculation
        double interestPayable = requestedCapital * interest * periodInMonths;
        //formatted result
        String formattedInterestPayable = String.format("%.0f", interestPayable);

        //calculation total amount to be paid to the bank
        double totalAmount = requestedCapital + interestPayable;
        //formatted result
        String formattedTotalAmount = String.format("%.0f", totalAmount);

        System.out.println("The total to pay for a loan " + "$"+ requestedCapital +
                            " with an interest " + "$" + formattedInterestPayable + " of per " +
                            periodInMonths + " month is " + formattedTotalAmount);
    }
}
