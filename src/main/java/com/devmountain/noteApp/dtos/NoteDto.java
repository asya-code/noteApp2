package com.devmountain.noteApp.dtos;
import com.devmountain.noteApp.entities.Note;
import com.devmountain.noteApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto implements Serializable{
    private Long id;
    private String body;
    private UserDto userDto;

    public NoteDto(Note note) {
        if (note.getId() != null) {
            this.id = note.getId();
        }

        if (note.getBody() != null) {
            this.body = note.getBody();
        }
    }
}
/*


    public UserDto(User user) {
        if (user.getId() != null) {
            this.username = user.getUsername();
        }

        if (user.getPassword() != null) {
            this.password = user.getPassword();
        }
    }

}

 */