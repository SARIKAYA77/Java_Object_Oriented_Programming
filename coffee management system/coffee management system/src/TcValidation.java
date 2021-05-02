public   class TcValidation implements CustomerCheckService {



    @Override
    public boolean IsFakePerson(Customer customer) {
        System.out.println("validation");
        return validateTckno(customer);

    }

    public boolean validateTckno(Customer customer) {
        String TCNo = customer.getNationalityId();

        //11 haneden olusmali.
        if (TCNo.length() != 11)
            return false;

        //1. 3. 5. 7. ve 9. hanelerin toplamı
        int sum1 =
                Character.getNumericValue(TCNo.charAt(0)) + Character.getNumericValue(TCNo.charAt(2)) +
                        Character.getNumericValue(TCNo.charAt(4)) + Character.getNumericValue(TCNo.charAt(6)) +
                        Character.getNumericValue(TCNo.charAt(8));
        // 2. 4. 6. ve 8. hanelerin toplamı
        int sum2 =
                Character.getNumericValue(TCNo.charAt(1)) + Character.getNumericValue(TCNo.charAt(3)) +
                        Character.getNumericValue(TCNo.charAt(5)) + Character.getNumericValue(TCNo.charAt(7));

        //ilk toplamin 7 katından, ikinci toplam cikartildiginda, sonucun 10’a bolumunden kalan, 10. haneyi vermeli.
        int tenthDigit = ((sum1 * 7) - sum2) % 10;
        if (tenthDigit != Character.getNumericValue(TCNo.charAt(9)))
            return false;

        //İlk on hanenin toplaminin 10'a bolumunden kalan onbirinci haneyi vermeli.
        int sum = sum1 + sum2 + Character.getNumericValue(TCNo.charAt(9));
        if ((sum % 10) != Character.getNumericValue(TCNo.charAt(10)))
            return false;

        return true;

    }

}


