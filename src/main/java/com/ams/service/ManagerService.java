package com.ams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.entity.Hangar;
import com.ams.entity.HangarStatus;
import com.ams.entity.Manager;
import com.ams.entity.Plane;
@Service
public interface ManagerService{
	
	public List<Plane> viewPlanes();
	public List<HangarStatus> viewHangarStatus(int managerId);
	public int allotHangartoPlane(int planeId,int hangarId);
	public int allotPlanetoHangar(int planeId,int hangarId);
	public Manager addManager(Manager manager);
	public int checkManagerLogin(String username, String password);
	public int getManagerId(String username);
	public HangarStatus hangarStatus(int hangarId);
	public HangarStatus  updateHangar(HangarStatus hangarStatus);
}
