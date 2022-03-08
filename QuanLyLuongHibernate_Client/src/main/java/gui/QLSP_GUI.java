/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import app.App;
import dao.SanPhamDao;

import entity.SanPham;

/**
 *
 * @author tcao2
 */
public class QLSP_GUI extends javax.swing.JPanel implements ActionListener,MouseListener{
	private static final Component CongDoan_GUI = null;
    private DefaultTableModel modelSP;
    private SanPhamDao spdao = App.spDao;
    /**
     * Creates new form QLNhanvien
     * @throws RemoteException 
     */
    public QLSP_GUI() throws RemoteException {
    	initComponents();
        txtMa.setEnabled(false);
        jbnThem.setFocusPainted(false);
        jbnCapnhat.setFocusPainted(false);
        jbnCongdoan.setFocusPainted(false);
        jbnXoarong.setFocusPainted(false);
        modelSP = new DefaultTableModel(new String[] {"Mã sẩn phẩm", "Tên sản phẩm","Mô tả","Màu"}, 0);
        jTable1.setModel(modelSP);
        
        List<SanPham> ds = spdao.getSPall();
        for(int i=0;i<ds.size();i++)
        {
        	modelSP.addRow(new Object[] {ds.get(i).getMaSP(),ds.get(i).getTenSP(),ds.get(i).getMoTa(),ds.get(i).getMau()});
        }
        jbnThem.addActionListener(this);
        jbnCapnhat.addActionListener(this);
        jbnCongdoan.addActionListener(this);
        jbnXoarong.addActionListener(this);
        jTable1.addMouseListener(this);
        jTable1.setRowHeight(jTable1.getRowHeight()+20);
        JTableHeader h = jTable1.getTableHeader();
        h.setFont(new Font("Arial",Font.BOLD, 13));
 		h.setForeground(new Color(255, 255, 255));
 		h.setBackground(new Color(146, 200, 240));
        
        jbnCapnhat.setBackground(new Color(228, 237, 225));
 		jbnCongdoan.setBackground(new Color(228, 237, 225));
 		jbnThem.setBackground(new Color(228, 237, 225));
 		jbnXoarong.setBackground(new Color(228, 237, 225));
   }
   
   ArrayList<SanPham> dsnv = (ArrayList<SanPham>) spdao.getSPall();
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMa = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblMau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtMau = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        jbnThem = new javax.swing.JButton();
        jbnXoarong = new javax.swing.JButton();
        jbnCapnhat = new javax.swing.JButton();
        jbnCongdoan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 5));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sản phẩm"));

        lblMa.setText("Mã sản phẩm");

        lblTen.setText("Tên sản phẩm");

        lblMau.setText("Màu");

        jLabel1.setText("Mô tả");

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane1.setViewportView(txtMota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMau, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jbnThem.setBackground(new java.awt.Color(153, 255, 255));
        jbnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo for Design Form/Create.png"))); // NOI18N
        jbnThem.setText("Thêm");

        jbnXoarong.setBackground(new java.awt.Color(153, 255, 255));
        jbnXoarong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo for Design Form/Delete.png"))); // NOI18N
        jbnXoarong.setText("Làm mới");
        jbnXoarong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnXoarongActionPerformed(evt);
            }
        });

        jbnCapnhat.setBackground(new java.awt.Color(153, 255, 255));
        jbnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo for Design Form/Refresh.png"))); // NOI18N
        jbnCapnhat.setText("Cập nhật");

        jbnCongdoan.setBackground(new java.awt.Color(153, 255, 255));
        jbnCongdoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo for Design Form/Diagram.png"))); // NOI18N
        jbnCongdoan.setText("Công đoạn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbnXoarong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbnCongdoan, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnXoarong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jbnCongdoan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách sản phẩm"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbnXoarongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnXoarongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnXoarongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbnCapnhat;
    private javax.swing.JButton jbnCongdoan;
    private javax.swing.JButton jbnThem;
    private javax.swing.JButton jbnXoarong;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMau;
    private javax.swing.JLabel lblTen;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
	@Override
	public void mouseClicked(MouseEvent e) {
		int row = jTable1.getSelectedRow();
		txtMa.setText(jTable1.getValueAt(row, 0).toString());
		txtTen.setText(jTable1.getValueAt(row, 1).toString());
		txtMota.setText(jTable1.getValueAt(row, 2).toString());
		txtMau.setText(jTable1.getValueAt(row, 3).toString());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj.equals(jbnThem)) {
			if(txtTen.getText().equals("") || txtMota.getText().equals("") || txtMau.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ dữ liệu sản phẩm");
				txtTen.requestFocus();
			}
			else if(ktraten()&&ktramau()&&ktramoTa()){
			String maSP,tenSP,moTa,mau;
			maSP = null;
			try {
				maSP = taoMaSanPham();
			} catch (RemoteException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			tenSP = txtTen.getText();
			moTa= txtMota.getText();
			mau = txtMau.getText();
			SanPham sp = new SanPham(maSP, tenSP, moTa, mau);
			try {
				spdao.ThemSanPham(sp);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dsnv.add(sp);
			modelSP.addRow(new Object [] {sp.getMaSP(),sp.getTenSP(),sp.getMoTa(),sp.getMau()});	
			JOptionPane.showMessageDialog(null,"Thêm sản phẩm thành công");
		}
	}
		if(obj.equals(jbnCapnhat)) {
			
			int row = jTable1.getSelectedRow();
			String maSP,tenSP,moTa,mau;
			maSP = txtMa.getText();
			tenSP = txtTen.getText();
			moTa= txtMota.getText();
			mau = txtMau.getText();
			if(jTable1.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(null,"Vui lòng chọn sản phẩm cần cập nhật");
			}
			else if(txtTen.getText().equals("") || txtMota.getText().equals("") || txtMau.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ dữ liệu sản phẩm");
			}
			else if(ktraten()&&ktramau()&&ktramoTa()){
			int result = JOptionPane.showConfirmDialog(this,"Xác nhận cập nhật ?", "Cập nhật sản phẩm",
		               JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION){
			SanPham sp = new SanPham(maSP,tenSP, moTa, mau);
			try {
				if(spdao.SuaSP(sp)) {
					modelSP.setValueAt(txtTen.getText(), row, 1);
					modelSP.setValueAt(txtMota.getText(), row, 2);
					modelSP.setValueAt(txtMau.getText(), row, 3);
					JOptionPane.showMessageDialog(null, "Cập nhật sản phẩm thành công");
				}
			} catch (HeadlessException | RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}}
		if(obj.equals(jbnCongdoan)) {
			if(jTable1.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(null,"Vui lòng chọn sản phẩm cần xem công đoạn");
			}
			else {
			int row = jTable1.getSelectedRow();
			SanPham sp = spdao.getmaSp(jTable1.getValueAt(row, 0).toString()).get(0);
			try {
				new CongDoan_GUI(sp).setVisible(true);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
		if(obj.equals(jbnXoarong)) {
			txtMa.setText("");
			txtTen.setText("");
			txtMau.setText("");
			txtMota.setText("");
			txtTen.requestFocus();
		}
	}
	public String taoMaSanPham() throws RemoteException {
		SanPham sp =spdao.getSPCuoi();
		if(sp==null)
		{
			return "SP001";
		}
		String maCuoi = spdao.getSPCuoi().getMaSP();
		long so = Long.parseLong(maCuoi.substring(2)) + 1000 + 1;
		String soMoi = ("" + so).substring(1);
		return "SP" + soMoi;
	}
	public boolean ktraten()
	{
	String reg="([AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)(\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)*";
	if(!txtTen.getText().matches(reg))
	{
		JOptionPane.showMessageDialog(this,"Tên sản phẩm viết hoa chữ đầu");
		return false;
	}return true;
	}
	public boolean ktramoTa()
	{
		String reg="([AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)(\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)*";
		if(!txtMota.getText().matches(reg))
		{
			JOptionPane.showMessageDialog(this,"Mô tả sản phẩm viết hoa chữ đầu");
			return false;
		}return true;
	}
	public boolean ktramau()
	{
		String reg="([AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)(\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]*)*";
		if(!txtMau.getText().matches(reg))
		{
			JOptionPane.showMessageDialog(this,"Màu sản phẩm viết hoa chữ đầu");
			return false;
		}return true;
	}
}