package com.ironhack.EjercicioEnums;
/*In an Account class like the one from from the BigDecimal activity add a Hold enum. The Hold state should indicate if there is a reason for placing a hold on theAccount. The potential Hold states are NONE, FRAUD, DELINQUENCY, LOST_STOLEN, LITIGATION_HOLD, FREERIDING.*/


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.ironhack.EjercicioEnums.Hold.LOST_STOLEN;

public class Main {
    public static void main(String [] x) {
        Account account = new Account(LOST_STOLEN, 12255, "Arthur", new BigDecimal("123.58894") );
        System.out.println(account.getState());
        System.out.println(Hold.values().length);
        System.out.println(Hold.values().clone());

        Map <Long, Account> accounts = new HashMap<>();
        accounts.put(account.getId(), account);
        System.out.println(accounts);

        for(var i : accounts.entrySet()){
            System.out.println(i.getValue().toString());
        }

        Map <Character, Integer> charsFound = new HashMap<>();
        Set<Character> unique = new HashSet<>();

        var f = "Hello there".toLowerCase();

        for(char c : f.toCharArray()) {
            charsFound.put(c, charsFound.getOrDefault(c, 0) + 1);
            unique.add(c);
        }

        System.out.println(charsFound);
        System.out.println(unique);
     }
}
