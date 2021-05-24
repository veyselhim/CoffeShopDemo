package Entities;

import Abstract.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBirdth;
    private long nationaltyId;


}
