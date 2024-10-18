package org.functionalprog.supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
        System.out.println(getDBConnectionUrlsSupplierList.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    // data type could be any thing like custom classes, objects, array, List.
    static Supplier<String> getDBConnectionUrlsSupplier =
            () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlsSupplierList =
            () -> List.of(
                    "jdbc://localhost:5432/users", "jdbc://localhost:5432/customers"
            );
}
