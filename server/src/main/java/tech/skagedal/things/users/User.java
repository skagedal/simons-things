package tech.skagedal.things.users;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.jdbc.annotation.ColumnTransformer;
import java.util.UUID;
import javax.validation.constraints.NotNull;

@MappedEntity
public class User {
    @Id
    @ColumnTransformer(read = "BIN_TO_UUID(user_.id)", write = "UUID_TO_BIN(?)")
    private UUID id;
    @NotNull
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
