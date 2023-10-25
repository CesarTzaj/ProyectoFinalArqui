
package com.sisteamderiego.sisteamderiego.persistance.repository;

import com.sisteamderiego.sisteamderiego.domain.dto.RecordInputDTO;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.RecordInputRepositoryDTO;
import com.sisteamderiego.sisteamderiego.persistance.crud.RecordInputCrud;
import com.sisteamderiego.sisteamderiego.persistance.entity.RecordInput;
import com.sisteamderiego.sisteamderiego.persistance.mapper.RecordInputMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;



@Repository
public class RecordInputRepository implements RecordInputRepositoryDTO{

    @Autowired
    RecordInputCrud crud;
    @Autowired
    RecordInputMapper mapper;

    
    @Override
    public Page<RecordInputDTO> getAll(Pageable pageable) {
        Page<RecordInput> products = crud.findByOrderByDateDesc(pageable);      
        List<RecordInputDTO> recordDTOs = mapper.toRecordInputDTOs(products.getContent());
        return new PageImpl<>(recordDTOs, pageable,products.getTotalElements());
    }


    @Override
    public RecordInputDTO save(RecordInputDTO recordInputDTO) {
        RecordInput recordInput = mapper.toRecordInput(recordInputDTO);
        return mapper.toRecordInputDTO(crud.save(recordInput));
    }

 
    
}
