package com.Luxebnb.Service;
import com.Luxebnb.Dto.PackageDto;
import com.Luxebnb.Model.PackageModel;
import com.Luxebnb.Repository.PackageRepository;
import com.Luxebnb.Utill.VariableList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PackageService {

    @Autowired
    private PackageRepository airportRepository;

    @Autowired
    private ModelMapper modelMapper;
    public String saveAirport(PackageDto airportDto){
        if (airportRepository.existsById(airportDto.getAirportCode())){
            return VariableList.RSP_DUPLICATED;
        }else {

            airportRepository.save(modelMapper.map(airportDto, PackageModel.class));
            return VariableList.RSP_SUCCESS;

        }
    }

    public String updateAirport(PackageDto airportDto) {
        if (airportRepository.existsById(airportDto.getAirportCode())) {
            airportRepository.save(modelMapper.map(airportDto, PackageModel.class));
            return VariableList.RSP_SUCCESS;
        } else {
            return VariableList.R$P_NO_DATA_FOUND;
        }

    }

    public List<PackageDto> getAllAirport(){
        List<PackageModel> airportList= airportRepository.findAll();
        return modelMapper.map(airportList, new TypeToken<ArrayList<PackageDto>>(){

        }.getType());
    }

    public String deleteAirport(int airportCode){
        if (airportRepository.existsById(airportCode)){
            airportRepository.deleteById(airportCode);
            return VariableList.RSP_SUCCESS;
        }else {
            return VariableList.R$P_NO_DATA_FOUND;
        }
    }
}
