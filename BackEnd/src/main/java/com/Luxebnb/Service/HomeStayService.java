package com.Luxebnb.Service;

import com.Luxebnb.Dto.HomeStayDto;
import com.Luxebnb.Model.HomeStayModel;
import com.Luxebnb.Repository.HomeStayRepository;
import com.Luxebnb.Utill.VariableList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HomeStayService {

    @Autowired
    private HomeStayRepository flightRepository;

    @Autowired
    private ModelMapper modelMapper;
    public String saveFlight(HomeStayDto flightDto){
        if (flightRepository.existsById(flightDto.getFlightId())){
            return VariableList.RSP_DUPLICATED;
        }else {

            flightRepository.save(modelMapper.map(flightDto, HomeStayModel.class));
            return VariableList.RSP_SUCCESS;

        }
    }

    public String updateFlight(HomeStayDto flightDto) {
        if (flightRepository.existsById(flightDto.getFlightId())) {
            flightRepository.save(modelMapper.map(flightDto, HomeStayModel.class));
            return VariableList.RSP_SUCCESS;
        } else {
            return VariableList.R$P_NO_DATA_FOUND;
        }

    }

    public List<HomeStayDto> getAllFlight(){
        List<HomeStayModel> flightList= flightRepository.findAll();
        return modelMapper.map(flightList, new TypeToken<ArrayList<HomeStayDto>>(){

        }.getType());
    }

    public String deleteFlight(int flightId){
        if (flightRepository.existsById(flightId)){
            flightRepository.deleteById(flightId);
            return VariableList.RSP_SUCCESS;
        }else {
            return VariableList.R$P_NO_DATA_FOUND;
        }
    }

    public List<HomeStayDto> getFlightsByDepartureCountryAndDate(String departureCountry, LocalDate flightDate) {
        List<HomeStayModel> allFlights = flightRepository.findAll();

        return allFlights.stream()
                .filter(flight -> flight.getDepartureCountry().equalsIgnoreCase(departureCountry)
                        && flight.getFlightDate().isEqual(flightDate))
                .map(flight -> modelMapper.map(flight, HomeStayDto.class))
                .collect(Collectors.toList());
    }


}
