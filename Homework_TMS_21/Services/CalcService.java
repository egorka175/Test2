package by.tms.Homework_TMS_21.Services;

import by.tms.Homework_TMS_21.Storeges.OperationStorage;
import by.tms.Homework_TMS_21.entity.Operation;
import by.tms.Homework_TMS_21.entity.User;

import java.util.List;
import java.util.Optional;

public class CalcService {
    public final OperationStorage operationStorage = new OperationStorage();

    public Operation calc(double num1, double num2, String operation, User user) {
        switch (operation) {
            case "sum":
                operationStorage.save(new Operation(num1, num2, operation, num1 + num2, user));
                return new Operation(num1, num2, operation, num1 + num2, user);
            case "sub":
                operationStorage.save(new Operation(num1, num2, operation, num1 - num2, user));
                return new Operation(num1, num2, operation, num1 - num2, user);
            case "mul":
                operationStorage.save(new Operation(num1, num2, operation, num1 * num2, user));
                return new Operation(num1, num2, operation, num1 * num2, user);
            case "div":
                operationStorage.save(new Operation(num1, num2, operation, num1 / num2, user));
                return new Operation(num1, num2, operation, num1 / num2, user);

        }
        return null;
    }

    public List<Operation> findAll() {
        return operationStorage.getAll();
    }
}
