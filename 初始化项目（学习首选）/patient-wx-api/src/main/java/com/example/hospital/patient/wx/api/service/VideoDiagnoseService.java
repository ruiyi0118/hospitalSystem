package com.example.hospital.patient.wx.api.service;

import com.example.hospital.patient.wx.api.db.pojo.VideoDiagnoseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface VideoDiagnoseService {
    public ArrayList<HashMap> searchOnlineDoctorList(String subName, String job);
    public HashMap createVideoDiagnose(int userId, VideoDiagnoseEntity entity);
    public void updatePayment(Map param);
    public boolean searchPaymentResult(String outTradeNo);
    public ArrayList<HashMap> searchImageByVideoDiagnoseId(int videoDiagnoseId);
    public String updateImage(MultipartFile file, Integer videoDiagnoseId);
    public void deleteImage(Map param);
    public String searchRoomId(int doctorId);
}

