package com.ironhack.HashMap;

import com.ironhack.EjercicioEnums.Account;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.ironhack.EjercicioEnums.Hold.LOST_STOLEN;

public class MainMap {
    public static void main(String [] f) {
        Map <String, String> phoneBook = new HashMap<>();

        phoneBook.put("Salva", "+45465636");
        phoneBook.put("Esther", "89865");
        phoneBook.put("Louis", "7565232");

        System.out.println(phoneBook);

        var salvaPhone = phoneBook.get("Salva");
        System.out.println(salvaPhone);

        Account account = new Account(LOST_STOLEN, 12255, "Arthur", new BigDecimal("123.58894") );
        HashMap <Long, Account> user = new HashMap<>();

        user.put(account.getId(), account);


        System.out.println(user.get(12255));
        System.out.println(user.get(12255).getName());
    }
}
