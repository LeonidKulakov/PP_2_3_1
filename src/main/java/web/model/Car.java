package web.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {
    private String model;
    private String color;
    private Integer price;
}
