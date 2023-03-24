USE QuanLynghiduongFurama;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien
where (ho_ten like "H%" or 
ho_ten like "T%" or
ho_ten like "K%" ) and
char_length(ho_ten)<=15;
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select  *  from khach_hang
where (year(ngay_sinh) between 1973 and 2005)
and (dia_chi like "%Đà Nẵng" or dia_chi like "%Quảng Trị");
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select  khach_hang.ma_khach_hang, count(hop_dong.ma_khach_hang) as so_lan from hop_dong 
join khach_hang on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang  join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
 where ten_loai_khach="Diamond"
group by khach_hang.ma_khach_hang
order by so_lan;
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.ma_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach,hop_dong.ma_hop_dong,dich_vu.ten_dich_vu,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,(ifnull(chi_phi_thue,0)+ifnull(so_luong,0)*ifnull(gia,0)) as tong_tien from
khach_hang 
left join loai_khach on khach_hang.ma_loai_khach=loai_khach.ma_loai_khach
left join hop_dong on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
left join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem;
-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select dich_vu.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu from dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where dich_vu.ma_dich_vu not in
(
select dich_vu.ma_dich_vu from dich_vu
join hop_dong on dich_vu.ma_dich_vu=hop_dong.ma_dich_vu
and 
ngay_lam_hop_dong between "2021-1-1" and"2021-3-31"
);
-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021. 
select dich_vu.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu from dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where dich_vu.ma_dich_vu not in
(
select dich_vu.ma_dich_vu from dich_vu
join hop_dong on dich_vu.ma_dich_vu=hop_dong.ma_dich_vu
and 
year(ngay_ket_thuc)=2021
);
-- 8. 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
select distinct ho_ten from khach_hang;
select ho_ten from khach_hang
group by ho_ten;
select ho_ten from khach_hang
where ho_ten  in(
select ho_ten from khach_hang
group by ho_ten
);
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong),count(ma_khach_hang) from hop_dong
where month(ngay_lam_hop_dong)  in(
select month(ngay_lam_hop_dong) from hop_dong
where  
year(ngay_lam_hop_dong)=2021
)
group by month(ngay_lam_hop_dong)
order by month(ngay_lam_hop_dong);
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select hop_dong.ma_hop_dong,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,hop_dong.tien_dat_coc, sum(ifnull(so_luong,0)) from hop_dong 
 left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong 
group by hop_dong.ma_hop_dong;
-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem from dich_vu_di_kem
 join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
 join hop_dong on hop_dong_chi_tiet.ma_hop_dong=hop_dong.ma_hop_dong
 join khach_hang on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
 join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
where ((loai_khach.ten_loai_khach="Diamond") and
(khach_hang.dia_chi like "%Vinh%" or khach_hang.dia_chi like "%Quảng Ngãi%"));
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hop_dong.ma_hop_dong,nhan_vien.ho_ten, khach_hang.ho_ten, khach_hang.so_dien_thoai, dich_vu.ten_dich_vu,sum(hop_dong_chi_tiet.so_luong),hop_dong.tien_dat_coc from dich_vu
join hop_dong using (ma_dich_vu)
join khach_hang using (ma_khach_hang)
join nhan_vien using (ma_nhan_vien)
join hop_dong_chi_tiet using (ma_hop_dong)
where (hop_dong.ngay_lam_hop_dong between "2020-10-01" and "2020-12-31") and hop_dong.ngay_lam_hop_dong not in(
select hop_dong.ngay_lam_hop_dong from hop_dong where hop_dong.ngay_lam_hop_dong between "2021-01-01" and "2020-06-30")
group by hop_dong.ma_hop_dong;
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem,dich_vu_di_kem.gia, sum(hop_dong_chi_tiet.so_luong) as tong from dich_vu_di_kem
join hop_dong_chi_tiet using(ma_dich_vu_di_kem)
group by dich_vu_di_kem.ma_dich_vu_di_kem
order by tong desc
limit 2;
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem,dich_vu_di_kem.gia, count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as tong from dich_vu_di_kem
join hop_dong_chi_tiet using(ma_dich_vu_di_kem)
join hop_dong using(ma_hop_dong)
join dich_vu using(ma_dich_vu)
join loai_dich_vu using(ma_loai_dich_vu)
group by dich_vu_di_kem.ma_dich_vu_di_kem
having count(hop_dong_chi_tiet.ma_dich_vu_di_kem)=1;
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi from nhan_vien
right join hop_dong using (ma_nhan_vien)
join trinh_do using (ma_trinh_do)
join bo_phan using (ma_bo_phan)
where ngay_lam_hop_dong between "2020-01-01" and "2021-12-31"
group by nhan_vien.ma_nhan_vien
having count(hop_dong.ma_nhan_vien)<4;
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from nhan_vien where not exists(select nhan_vien.ma_nhan_vien from hop_dong 
where hop_dong.ngay_lam_hop_dong between "2020-01-01" and "2021-12-31" and hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien);
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.\
create view nb as
select khach_hang.ma_khach_hang,loai_khach.ten_loai_khach,sum((ifnull(chi_phi_thue,0)+ifnull(so_luong,0)*ifnull(gia,0))) as tong_tien
from khach_hang
join loai_khach using(ma_loai_khach)
join hop_dong using(ma_khach_hang)
join hop_dong_chi_tiet using(ma_hop_dong)
join dich_vu using(ma_dich_vu)
join dich_vu_di_kem using(ma_dich_vu_di_kem)
where year(hop_dong.ngay_lam_hop_dong)=2021
group by khach_hang.ma_khach_hang;
update khach_hang 
set ma_loai_khach  = ( select ma_loai_khach from loai_khach where ten_loai_khach like "Diamond") 
where ma_khach_hang in (select ma_khach_hang from nb where nb.tong_tien>10000000);
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
delete khach_hang, hop_dong, hop_dong_chi_tiet from khach_hang join hop_dong using(ma_khach_hang)
join hop_dong_chi_tiet using (ma_hop_dong)
where not exists (select hop_dong.ma_hop_dong where year(ngay_lam_hop_dong)>"2021" and khach_hang.ma_khach_hang=hop_dong.ma_khach_hang);
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
create view tmp as
select dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.gia,hop_dong.ngay_lam_hop_dong,sum(hop_dong_chi_tiet.so_luong) as so_lan from dich_vu_di_kem
join hop_dong_chi_tiet using(ma_dich_vu_di_kem)
join hop_dong using(ma_hop_dong)
group by dich_vu_di_kem.ma_dich_vu_di_kem;
update dich_vu_di_kem
set gia= gia*2
where dich_vu_di_kem.ma_dich_vu_di_kem in (select tmp.ma_dich_vu_di_kem from tmp where year(ngay_lam_hop_dong)="2020" and so_lan>10);
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select ma_khach_hang,ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from khach_hang
union all
select ma_nhan_vien,ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from nhan_vien;