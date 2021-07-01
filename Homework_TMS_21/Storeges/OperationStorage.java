package by.tms.Homework_TMS_21.Storeges;

import by.tms.Homework_TMS_21.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationStorage {
        private static List<Operation> operationList = new ArrayList<>();

        public void save(Operation o){
            operationList.add(o);
        }

        public List<Operation> getAll(){
            return new ArrayList<>(operationList);
        }
}
