package com.sisteamderiego.sisteamderiego.domain.repositoryDTO;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleDTO;
import java.util.List;

public interface WateringScheduleRepositoryDTO {

    List<WateringScheduleDTO> getAll();

    WateringScheduleDTO save(WateringScheduleDTO wateringScheduleDTO);

    void delete(int id);
}
