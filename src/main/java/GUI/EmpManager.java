package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import BUS.EmpMgrControl;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class EmpManager extends JFrame {
	
	private BorderLayout borderLayout;
	private JPanel pnlHeader;
	private JLabel lblHeaderTitle;
	private JPanel pnlMenu;
	private JPanel pnlMenuZoom;
	private JLabel lblIconZoomOut;
	private JLabel lblIconZoomIn;
	private JPanel pnlMenuDetail;
	private JPanel pnlLogo;
	private JPanel pnlMngList;
	private JPanel pnlLeft;
	private JPanel pnlRight;
	private JPanel pnlBottom;
	private JPanel pnlListDeTail;
	private JLabel lblTourManager;
	private JLabel lblCusManager;
	private JLabel lblStaffManager;
	private JLabel lblTicManager;
	private JLabel lblSerManager;
	private JLabel lblHotelManager;
	private JLabel lblVehManager;
	private JLabel lblAccManager;
	private JLabel lblStatisticalManager;
	private JPanel pnlContent;
	private JPanel pnlZoom;
	private JPanel pnlSetting;
	private JPanel pnlTourManager;
	private JPanel pnlCusManager;
	private JPanel pnlStaffManager;
	private JPanel pnlTicManager;
	private JPanel pnlSerManager;
	private JPanel pnlHotelManager;
	private JPanel pnlVehManager;
	private JPanel pnlAccManager;
	private JPanel pnlStatisticalManager;
	
	public EmpManager(JLabel lblIconZoomOut, JLabel lblIconZoomIn, JLabel lblTourManager, JLabel lblCusManager, JLabel lblStaffManager,
			JLabel lblTicManager, JLabel lblSerManager, JLabel lblHotelManager, JLabel lblVehManager, JLabel lblAccManager, JLabel lblStatisticalManager,
			JPanel pnlTourManager, JPanel pnlCusManager, JPanel pnlStaffManager, JPanel pnlTicManager, JPanel pnlSerManager, JPanel pnlHotelManager,
			JPanel pnlVehManager, JPanel pnlAccManager, JPanel pnlStatisticalManager, JPanel pnlZoom) {
		this.lblIconZoomOut = lblIconZoomOut;
		this.lblIconZoomIn = lblIconZoomIn;
		this.lblTourManager = lblTourManager;
		this.lblCusManager = lblCusManager;
		this.lblStaffManager = lblStaffManager;
		this.lblTicManager = lblTicManager;
		this.lblSerManager = lblSerManager;
		this.lblHotelManager = lblHotelManager;
		this.lblVehManager = lblVehManager;
		this.lblAccManager = lblAccManager;
		this.lblStatisticalManager = lblStatisticalManager;	
		this.pnlTourManager = pnlTourManager;
		this.pnlCusManager = pnlCusManager;
		this.pnlStaffManager = pnlStaffManager;
		this.pnlTicManager = pnlTicManager;		
		this.pnlSerManager = pnlSerManager;	
		this.pnlHotelManager = pnlHotelManager;
		this.pnlVehManager = pnlVehManager;
		this.pnlAccManager = pnlAccManager;
		this.pnlStatisticalManager = pnlStatisticalManager;
		this.pnlZoom = pnlZoom;
	}
	
	public JLabel getLblIconZoomOut() {
		return lblIconZoomOut;
	}

	public void setLblIconZoomOut(JLabel lblIconZoomOut) {
		this.lblIconZoomOut = lblIconZoomOut;
	}

	public JLabel getLblIconZoomIn() {
		return lblIconZoomIn;
	}

	public void setLblIconZoomIn(JLabel lblIconZoomIn) {
		this.lblIconZoomIn = lblIconZoomIn;
	}
	
	public JLabel getLblTourManager() {
		return lblTourManager;
	}

	public void setLblTourManager(JLabel lblTourManager) {
		this.lblTourManager = lblTourManager;
	}

	public JLabel getLblCusManager() {
		return lblCusManager;
	}

	public void setLblCusManager(JLabel lblCusManager) {
		this.lblCusManager = lblCusManager;
	}

	public JLabel getLblStaffManager() {
		return lblStaffManager;
	}

	public void setLblStaffManager(JLabel lblStaffManager) {
		this.lblStaffManager = lblStaffManager;
	}

	public JLabel getLblTicManager() {
		return lblTicManager;
	}

	public void setLblTicManager(JLabel lblTicManager) {
		this.lblTicManager = lblTicManager;
	}

	public JLabel getLblSerManager() {
		return lblSerManager;
	}

	public void setLblSerManager(JLabel lblSerManager) {
		this.lblSerManager = lblSerManager;
	}

	public JLabel getLblHotelManager() {
		return lblHotelManager;
	}

	public void setLblHotelManager(JLabel lblHotelManager) {
		this.lblHotelManager = lblHotelManager;
	}

	public JLabel getLblVehManager() {
		return lblVehManager;
	}

	public void setLblVehManager(JLabel lblVehManager) {
		this.lblVehManager = lblVehManager;
	}

	public JLabel getLblAccManager() {
		return lblAccManager;
	}

	public void setLblAccManager(JLabel lblAccManager) {
		this.lblAccManager = lblAccManager;
	}

	public JLabel getLblStatisticalManager() {
		return lblStatisticalManager;
	}

	public void setLblStatisticalManager(JLabel lblStatisticalManager) {
		this.lblStatisticalManager = lblStatisticalManager;
	}
	
	public JPanel getPnlTourManager() {
		return pnlTourManager;
	}

	public void setPnlTourManager(JPanel pnlTourManager) {
		this.pnlTourManager = pnlTourManager;
	}

	public JPanel getPnlCusManager() {
		return pnlCusManager;
	}

	public void setPnlCusManager(JPanel pnlCusManager) {
		this.pnlCusManager = pnlCusManager;
	}

	public JPanel getPnlStaffManager() {
		return pnlStaffManager;
	}

	public void setPnlStaffManager(JPanel pnlStaffManager) {
		this.pnlStaffManager = pnlStaffManager;
	}

	public JPanel getPnlTicManager() {
		return pnlTicManager;
	}

	public void setPnlTicManager(JPanel pnlTicManager) {
		this.pnlTicManager = pnlTicManager;
	}

	public JPanel getPnlSerManager() {
		return pnlSerManager;
	}

	public void setPnlSerManager(JPanel pnlSerManager) {
		this.pnlSerManager = pnlSerManager;
	}

	public JPanel getPnlHotelManager() {
		return pnlHotelManager;
	}

	public void setPnlHotelManager(JPanel pnlHotelManager) {
		this.pnlHotelManager = pnlHotelManager;
	}

	public JPanel getPnlVehManager() {
		return pnlVehManager;
	}

	public void setPnlVehManager(JPanel pnlVehManager) {
		this.pnlVehManager = pnlVehManager;
	}

	public JPanel getPnlAccManager() {
		return pnlAccManager;
	}

	public void setPnlAccManager(JPanel pnlAccManager) {
		this.pnlAccManager = pnlAccManager;
	}

	public JPanel getPnlStatisticalManager() {
		return pnlStatisticalManager;
	}

	public void setPnlStatisticalManager(JPanel pnlStatisticalManager) {
		this.pnlStatisticalManager = pnlStatisticalManager;
	}
	
	public JPanel getPnlZoom() {
		return pnlZoom;
	}

	public void setPnlZoom(JPanel pnlZoom) {
		this.pnlZoom = pnlZoom;
	}

	public EmpManager() {
//		EmpMgrModel empManagerModel = new EmpMgrModel();
		init();
	}
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		setLocationRelativeTo(null);
		
		// Event
		MouseListener mouseListener = new EmpMgrControl(this);
		MouseListener mouseListener1 = new EmpMgrControl(this);
		
		borderLayout = new BorderLayout();	
		getContentPane().setLayout(borderLayout);
		
		// Create header at NORTH
		pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(129, 212, 250));
		getContentPane().add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		
		// Create title into pnlHeader
		lblHeaderTitle = new JLabel("Quản Lí Tour Du Lịch");
		lblHeaderTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		pnlHeader.add(lblHeaderTitle);
		
		// Create pnlMenu at WEST
		pnlMenu= new JPanel();
		getContentPane().add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setLayout(new BorderLayout());
		
		// Create pnlMenuZoom into pnlMenu
		pnlMenuZoom = new JPanel();
		pnlMenuZoom.setBackground(new Color(129, 212, 250));
		pnlMenuZoom.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlMenuZoom.setPreferredSize(new Dimension(50, 10));
		pnlMenu.add(pnlMenuZoom, BorderLayout.WEST);
		pnlMenuZoom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		pnlZoom = new JPanel();
		pnlZoom.setBackground(new Color(129, 212, 250));
		pnlZoom.setPreferredSize(new Dimension(50, 33));
		pnlZoom.setLayout(null);
		pnlMenuZoom.add(pnlZoom);
		
		
		pnlSetting = new JPanel();
		pnlSetting.setPreferredSize(new Dimension(50, 33));
		pnlMenuZoom.add(pnlSetting);
		pnlSetting.setLayout(null);
		
		
		// Create lblIconZoom into pnlMenuZoom
		lblIconZoomOut = new JLabel("", JLabel.CENTER);
		lblIconZoomOut.setBounds(0, 0, 50, 33);
		lblIconZoomOut.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/zoomout.png"))));
		lblIconZoomOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomOut.addMouseListener(mouseListener);
		pnlZoom.add(lblIconZoomOut);
		
		// Create pnlMenuDetail into pnlMenu
		pnlMenuDetail = new JPanel();
		pnlMenuDetail.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlMenuDetail.setPreferredSize(new Dimension(222, 10));
		pnlMenu.add(pnlMenuDetail, BorderLayout.EAST);
		pnlMenuDetail.setLayout(new BorderLayout());
		
		pnlLogo = new JPanel();
		pnlLogo.setBackground(new Color(119, 122, 236));
		pnlLogo.setPreferredSize(new Dimension(10, 150));
		pnlMenuDetail.add(pnlLogo, BorderLayout.NORTH);
		
		pnlMngList = new JPanel();
		pnlMngList.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.add(pnlMngList, BorderLayout.CENTER);
		pnlMngList.setLayout(new BorderLayout(0, 0));
		
		pnlLeft = new JPanel();
		pnlLeft.setBackground(new Color(119, 122, 236));
		pnlLeft.setPreferredSize(new Dimension(25, 10));
		pnlMngList.add(pnlLeft, BorderLayout.WEST);
		
		pnlRight = new JPanel();
		pnlRight.setBackground(new Color(119, 122, 236));
		pnlRight.setPreferredSize(new Dimension(25, 10));
		pnlMngList.add(pnlRight, BorderLayout.EAST);
		
		pnlBottom = new JPanel();
		pnlBottom.setBackground(new Color(119, 122, 236));
		pnlBottom.setPreferredSize(new Dimension(10, 60));
		pnlMngList.add(pnlBottom, BorderLayout.SOUTH);
		
		pnlListDeTail = new JPanel();
		pnlListDeTail.setBackground(new Color(119, 122, 236));
		pnlMngList.add(pnlListDeTail, BorderLayout.CENTER);
		pnlListDeTail.setLayout(new GridLayout(9, 1, 10, 10));
		
		pnlTourManager = new JPanel();
		pnlTourManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlTourManager);
		pnlTourManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlCusManager = new JPanel();
		pnlCusManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlCusManager);
		pnlCusManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlStaffManager = new JPanel();
		pnlStaffManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlStaffManager);
		pnlStaffManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlTicManager = new JPanel();
		pnlTicManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlTicManager);
		pnlTicManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlSerManager = new JPanel();
		pnlSerManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlSerManager);
		pnlSerManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlHotelManager = new JPanel();
		pnlHotelManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlHotelManager);
		pnlHotelManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlVehManager = new JPanel();
		pnlVehManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlVehManager);
		pnlVehManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlAccManager = new JPanel();
		pnlAccManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlAccManager);
		pnlAccManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlStatisticalManager = new JPanel();
		pnlStatisticalManager.setBackground(new Color(129, 212, 250));
		pnlListDeTail.add(pnlStatisticalManager);
		pnlStatisticalManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		// List Management into pnlMngList
		lblTourManager = new JLabel("   Tour Manager");
		lblTourManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/travel.png"))));
		lblTourManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTourManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTourManager.add(lblTourManager);
		lblTourManager.addMouseListener(mouseListener1);

		
		lblCusManager = new JLabel("   Customer Manager");
		lblCusManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/customer.png"))));
		lblCusManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCusManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlCusManager.add(lblCusManager);
		lblCusManager.addMouseListener(mouseListener1);
	
		lblStaffManager = new JLabel("   Staff Manager");
		lblStaffManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/staff.png"))));
		lblStaffManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStaffManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStaffManager.add(lblStaffManager);
		lblStaffManager.addMouseListener(mouseListener1);
		
		lblTicManager = new JLabel("   Ticket Manager");
		lblTicManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/ticket.png"))));
		lblTicManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTicManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTicManager.add(lblTicManager);
		lblTicManager.addMouseListener(mouseListener1);
	
		lblSerManager = new JLabel("   Service Manager");
//		lblSerManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/service.png"))));
		lblSerManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSerManager.add(lblSerManager);
		lblSerManager.addMouseListener(mouseListener1);
	
		lblHotelManager = new JLabel("   Hotel Manager");
		lblHotelManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/hotel.png"))));
		lblHotelManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlHotelManager.add(lblHotelManager);
		lblHotelManager.addMouseListener(mouseListener1);
		
		lblVehManager = new JLabel("  Vehicle Manager");
		lblVehManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/vehicle.png"))));
		lblVehManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVehManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlVehManager.add(lblVehManager);
		lblVehManager.addMouseListener(mouseListener1);

		lblAccManager = new JLabel("   Account Manager");
		lblAccManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/account.png"))));
		lblAccManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlAccManager.add(lblAccManager);
		lblAccManager.addMouseListener(mouseListener1);

		lblStatisticalManager = new JLabel("   Statistical");
		lblStatisticalManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/statistical.png"))));
		lblStatisticalManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatisticalManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStatisticalManager.add(lblStatisticalManager);
		lblStatisticalManager.addMouseListener(mouseListener1);
		
			
		// Create pnlContent at CENTER
		pnlContent = new JPanel();
		pnlContent.setBackground(new Color(64, 128, 128));
		getContentPane().add(pnlContent, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		pnlContent.add(lblNewLabel);
		
		
	}

	public void ZoomOutMenu() {
		MouseListener mouseListener = new EmpMgrControl(this);
		lblIconZoomIn = new JLabel("", JLabel.CENTER);
		lblIconZoomIn.setBounds(0, 0, 50, 33);
		lblIconZoomIn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(EmpManager.class.getResource("/img/zoomin.png"))));
		lblIconZoomIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomIn.addMouseListener(mouseListener);
		pnlZoom.add(lblIconZoomIn);
		
		pnlMenuDetail.setVisible(false);
		
//		pnlShow.setBackground(new Color(49, 38, 183));
//		pnlShow.setBounds(50, 0, 1034, 577);
//		pnlShow.setLayout(null);
//		pnlContent.add(pnlShow);
//		pnlShow.setVisible(true);
		
		lblIconZoomOut.setVisible(false);
		lblIconZoomIn.setVisible(true);
	}
	
	public void ZoomInMenu() {
//		pnlShow.setBackground(new Color(49, 38, 183));
//		pnlShow.setBounds(272, 0, 1034, 577);
//		pnlShow.setLayout(null);
//		pnlContent.add(pnlShow);
		pnlMenuDetail.setVisible(true);
		lblIconZoomOut.setVisible(true);
		lblIconZoomIn.setVisible(false);	
	}
}
