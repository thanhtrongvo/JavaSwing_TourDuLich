package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import GUI.Manager;


public class ManagerControl implements MouseListener, ActionListener, FocusListener{

	private Manager manager;
	
	public ManagerControl(Manager manager) {
		this.manager = manager;
	}
	
	public Manager getManager() {
		return manager;
	}
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == manager.getLblIconZoomOut()) {
			manager.ZoomOutMenu();
		}else if(e.getSource() == manager.getLblIconZoomIn()){
			manager.ZoomInMenu();
			
		}else if(e.getSource() == manager.getLblTourManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlTourContent");
		}else if(e.getSource() == manager.getLblCusManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlCusContent");
		}else if(e.getSource() == manager.getLblDesManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlDesContent");
		}else if(e.getSource() == manager.getLblBillManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlBillContent");
		}else if(e.getSource() == manager.getLblSerManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlSerContent");
		}else if(e.getSource() == manager.getLblHotelManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlHotelContent");
		}else if(e.getSource() == manager.getLblAccManager()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlAccContent");
		}else if(e.getSource() == manager.getLblStatistical()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlStatisticalContent");
		}else if(e.getSource() == manager.getLblExportExcel()){
			manager.getCardLayout().show(manager.getPnlMainContent(), "pnlExcelContent");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == manager.getLblIconZoomIn()){
			manager.getPnlZoom().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == manager.getLblIconZoomOut()) {
			manager.getPnlZoom().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblIconHome()) {
			manager.getPnlHome().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblIconSetting()) {
			manager.getPnlSetting().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblIconLogOut()) {
			manager.getPnlLogOut().setBackground(new Color(187, 222, 251));

		}else if(e.getSource() == manager.getLblTourManager()) {
			manager.getPnlTourManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblCusManager()){
			manager.getPnlCusManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == manager.getLblDesManager()) {
			manager.getPnlDesManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblBillManager()){
			manager.getPnlBillManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblSerManager()) {
			manager.getPnlSerManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblHotelManager()){
			manager.getPnlHotelManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == manager.getLblAccManager()){
			manager.getPnlAccManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == manager.getLblStatistical()) {
			manager.getPnlStatistical().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == manager.getLblExportExcel()) {
			manager.getPnlExportExcel().setBackground(new Color(187, 222, 251));
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == manager.getLblIconZoomIn()){
			manager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == manager.getLblIconZoomOut()) {
			manager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconHome()) {
			manager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconSetting()) {
			manager.getPnlSetting().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconLogOut()) {
			manager.getPnlLogOut().setBackground(new Color(33, 150, 243));
			
		}else if(e.getSource() == manager.getLblTourManager()) {
			manager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblCusManager()){
			manager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblDesManager()) {
			manager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblBillManager()){
			manager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblSerManager()) {
			manager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblHotelManager()){
			manager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblAccManager()){
			manager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblStatistical()) {
			manager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblExportExcel()) {
			manager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == manager.getLblIconZoomIn()){
			manager.getPnlZoom().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == manager.getLblIconZoomOut()) {
			manager.getPnlZoom().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblIconHome()) {
			manager.getPnlHome().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblIconSetting()) {
			manager.getPnlSetting().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblIconLogOut()) {
			manager.getPnlLogOut().setBackground(new Color(144, 202, 249));
		
		}else if(e.getSource() == manager.getLblTourManager()) {
			manager.getPnlTourManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblCusManager()){
			manager.getPnlCusManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == manager.getLblDesManager()) {
			manager.getPnlDesManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblBillManager()){
			manager.getPnlBillManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblSerManager()) {
			manager.getPnlSerManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblHotelManager()){
			manager.getPnlHotelManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == manager.getLblAccManager()){
			manager.getPnlAccManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == manager.getLblStatistical()) {
			manager.getPnlStatistical().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == manager.getLblExportExcel()) {
			manager.getPnlExportExcel().setBackground(new Color(144, 202, 249));
		}	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == manager.getLblIconZoomIn()){
			manager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == manager.getLblIconZoomOut()) {
			manager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconHome()) {
			manager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconSetting()) {
			manager.getPnlSetting().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == manager.getLblIconLogOut()) {
			manager.getPnlLogOut().setBackground(new Color(33, 150, 243));
				
		}else if(e.getSource() == manager.getLblTourManager()) {
			manager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblCusManager()){
			manager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblDesManager()) {
			manager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblBillManager()){
			manager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblSerManager()) {
			manager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblHotelManager()){
			manager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblAccManager()){
			manager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == manager.getLblStatistical()) {
			manager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == manager.getLblExportExcel()) {
			manager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == manager.getBtnEditTour()){
			manager.getCardLayoutEdit_ListTourDetail().show(manager.getPnlEdit_ListTourDetail(), "pnlEditTour");
		}else if(e.getSource() == manager.getBtnListTour()){
			manager.getCardLayoutEdit_ListTourDetail().show(manager.getPnlEdit_ListTourDetail(), "pnlListTour");
			
		}else if(e.getSource() == manager.getBtnEditCus()){
			manager.getCardLayoutEdit_ListCusDetail().show(manager.getPnlEdit_ListCusDetail(), "pnlEditCus");
		}else if(e.getSource() == manager.getBtnListCus()){
			manager.getCardLayoutEdit_ListCusDetail().show(manager.getPnlEdit_ListCusDetail(), "pnlListCus");
			
		}else if(e.getSource() == manager.getBtnEditHotel()){
			manager.getCardLayoutEdit_ListHotelDetail().show(manager.getPnlEdit_ListHotelDetail(), "pnlEditHotel");
		}else if(e.getSource() == manager.getBtnListHotel()){
			manager.getCardLayoutEdit_ListHotelDetail().show(manager.getPnlEdit_ListHotelDetail(), "pnlListHotel");
			
		}else if(e.getSource() == manager.getBtnEditAcc()){
			manager.getCardLayoutEdit_ListAccDetail().show(manager.getPnlEdit_ListAccDetail(), "pnlEditAcc");
		}else if(e.getSource() == manager.getBtnListAcc()){
			manager.getCardLayoutEdit_ListAccDetail().show(manager.getPnlEdit_ListAccDetail(), "pnlListAcc");
		}
		
		else if(e.getSource() == manager.getBtnEditSer()){
			manager.getCardLayoutEdit_ListSerDetail().show(manager.getPnlEdit_ListSerDetail(), "pnlEditSer");
		}else if(e.getSource() == manager.getBtnListSer()){
			manager.getCardLayoutEdit_ListSerDetail().show(manager.getPnlEdit_ListSerDetail(), "pnlListSer");
		
		}else if(e.getSource() == manager.getBtnEditBill()){
			manager.getCardLayoutEdit_ListBillDetail().show(manager.getPnlEdit_ListBillDetail(), "pnlEditBill");
		}else if(e.getSource() == manager.getBtnListBill()){
			manager.getCardLayoutEdit_ListBillDetail().show(manager.getPnlEdit_ListBillDetail(), "pnlListBill");
		
		}else if(e.getSource() == manager.getBtnEditDes()){
			manager.getCardLayoutEdit_ListDesDetail().show(manager.getPnlEdit_ListDesDetail(), "pnlEditDes");
		}else if(e.getSource() == manager.getBtnListDes()){
			manager.getCardLayoutEdit_ListDesDetail().show(manager.getPnlEdit_ListDesDetail(), "pnlListDes");
		}
		
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		if(manager.getTxtSearchTour().getText().equals("Search Tour")) {
			manager.getTxtSearchTour().setText(null);
			manager.getTxtSearchTour().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchTour());
			
		}if(manager.getTxtSearchCus().getText().equals("Search Customer")) {
			manager.getTxtSearchCus().setText(null);
			manager.getTxtSearchCus().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchCus());
			
		}if(manager.getTxtSearchHotel().getText().equals("Search Hotel")) {
			manager.getTxtSearchHotel().setText(null);
			manager.getTxtSearchHotel().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchHotel());
			
		}if(manager.getTxtSearchAcc().getText().equals("Search Account")) {
			manager.getTxtSearchAcc().setText(null);
			manager.getTxtSearchAcc().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchAcc());
			
		}if(manager.getTxtSearchSer().getText().equals("Search Service")) {
			manager.getTxtSearchSer().setText(null);
			manager.getTxtSearchSer().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchSer());
			
		}if(manager.getTxtSearchBill().getText().equals("Search Bill")) {
			manager.getTxtSearchBill().setText(null);
			manager.getTxtSearchBill().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchBill());
			
		}if(manager.getTxtSearchDes().getText().equals("Search tourist attraction")) {
			manager.getTxtSearchDes().setText(null);
			manager.getTxtSearchDes().requestFocus();
			manager.removePlaceholderStyle(manager.getTxtSearchDes());
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(manager.getTxtSearchTour().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchTour());
			manager.getTxtSearchTour().setText("Search Tour");
			
		}if(manager.getTxtSearchCus().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchCus());
			manager.getTxtSearchCus().setText("Search Customer");
			
		}if(manager.getTxtSearchHotel().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchHotel());
			manager.getTxtSearchHotel().setText("Search Hotel");
			
		}if(manager.getTxtSearchAcc().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchAcc());
			manager.getTxtSearchAcc().setText("Search Account");
		
		}if(manager.getTxtSearchSer().getText().length() == 0) {
		manager.addPlaceholderStyle(manager.getTxtSearchSer());
		manager.getTxtSearchSer().setText("Search Service");
		
		}if(manager.getTxtSearchBill().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchBill());
			manager.getTxtSearchBill().setText("Search Bill");
		
		}if(manager.getTxtSearchDes().getText().length() == 0) {
			manager.addPlaceholderStyle(manager.getTxtSearchDes());
			manager.getTxtSearchDes().setText("Search tourist attraction");
		
		}
		
	}	
	
}
