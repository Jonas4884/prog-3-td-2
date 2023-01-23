package app.foot.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode
@ToString
public class Player {
    private Integer id;
    private String name;
    private Boolean isGuardian;
    private String teamName;
}
