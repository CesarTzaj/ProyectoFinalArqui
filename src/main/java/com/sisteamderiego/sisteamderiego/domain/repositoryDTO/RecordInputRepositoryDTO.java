
package com.sisteamderiego.sisteamderiego.domain.repositoryDTO;

import com.sisteamderiego.sisteamderiego.domain.dto.RecordInputDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RecordInputRepositoryDTO {

    Page<RecordInputDTO> getAll(Pageable pageable);
    RecordInputDTO save(RecordInputDTO recordInputDTO);

}
