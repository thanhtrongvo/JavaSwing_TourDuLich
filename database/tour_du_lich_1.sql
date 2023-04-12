create database tour_du_lich;


-- staff: view customer , booking-order, news
-- manager: all of staff, customer, tour, hotel, place-scenic, tour_guider
-- admin: all

-- tour, customer, hotel ,place-scenic,booking-order, sys-account,statistic , permission, news, tour_guider


create table Permission
(
    per_id   int(10)      not null auto_increment,
    per_name varchar(100) null,
    per_code varchar(100) null,

    primary key (per_id)
);

drop table group_permission

insert into permission (per_name, per_code)
values ('view customer','customer/list');

insert into permission(per_name)
    value   ('create customer');

insert into permission (per_name, per_code)
values ('create customer','customer/create'),('edit customer','customer/edit'),
       ('delete customer', 'customer/delete');

insert into permission(per_name)
    values   ('create customer'),
           ();

create table `Group`
(
    group_id   int(10)      not null auto_increment,
    group_name varchar(100) null,

    primary key (group_id)
);

insert into `Group` (group_name)
values ('admin'), ('manager'), ('staff'), ('customer');

create table Group_Permission
(
    group_per_id int(10) not null auto_increment,
    group_id     int(11) NULL,
    per_id       int(11) NULL,
    PRIMARY KEY (group_per_id),

    CONSTRAINT fk_Group_Permission_Group FOREIGN KEY (group_id)
        REFERENCES `Group` (group_id) ON DELETE restrict on update cascade,

    CONSTRAINT fk_Group_Permission_Permission FOREIGN KEY (per_id)
        REFERENCES Permission (per_id) ON DELETE restrict on update cascade
);

insert into group_permission (group_id, per_id)
values
(3,1),(2,1);

create table User
(
    user_id    int(10) auto_increment not null,
    user_name  varchar(100)           not null,
    password   varchar(100)           not null,
    first_name varchar(100)           null,
    last_name  varchar(100)           null,
    tel        int(10)                null,
    birthday   date                   null,
    email      text                   null,
    create_at  datetime                        default current_timestamp,
    grp_per_id int                    not null default 4,
    primary key (user_id),

    constraint idx_unq_user_name
        unique (user_name),

    constraint fk_User_Group
        foreign key (grp_per_id) references `Group` (group_id) on delete restrict on update cascade

);

insert into user (user_name, password, first_name, last_name, tel, birthday, email,grp_per_id)
values ('staff','123',null,null,null,null,null,3);

create table TourGuider
(
    tourguide_id int(10) auto_increment not null,
    first_name   varchar(100)           null,
    last_name    varchar(100)           null,
    tel          int(10)                null,
    birthday     date                   null,
    email        text                   null,
    create_at    datetime                        default current_timestamp,
    status       tinyint                not null default 0,
    primary key (tourguide_id)

);

insert into tourguider (first_name, last_name, tel, birthday, email)
values ('van teo','nguyen',0932123456,null,null);

create table Tour
(
    tour_id           int(10) auto_increment not null,
    tour_name         varchar(100)           not null,
    tourguide_id      int(10)                not null,
    hotel_id          int(10)                not null,
    adult_price       decimal(20, 4)         not null,
    child_price       decimal(20, 4)         not null,
    adult_number      int(10)                not null default 50,
    child_number      int(10)                not null default 50,
    schedule_describe text                   null,
    status            tinyint                not null default 0,
    create_at         datetime                   default current_timestamp,

    primary key (tour_id),

    constraint fk_Tour_TourGuide
        foreign key (tourguide_id) references TourGuider (tourguide_id) on delete restrict on update cascade,
    constraint fk_Tour_Hotel
        foreign key (hotel_id) references Hotel (hotel_id) on delete restrict on update cascade

);

insert into tour (tour_name, tourguide_id, hotel_id, adult_price, child_price, schedule_describe)
values ('chuyen du lich da lat', 1,1,1000000,500000,'Trải nghiệm mùa hoa tuyết Hàn Quốc
Hàn Quốc là đất nước níu chân khách du lịch khắp thế giới với thiên nhiên tươi đẹp bốn mùa. Du lịch Hàn Quốc đem đến những cảm nhận tuyệt vời về nét đặc trưng Á Đông truyền thống nhưng không kém phần hiện đại với rất nhiều danh lam thắng cảnh nổi tiếng khắp đất nước. Riêng Seoul đã có bao nhiêu cảnh sắc thu hút du khách: Đảo Nami xinh đẹp và bình yên, Lotte World là xứ sở thần tiên, những lễ hội vui nhộn, đậm đà bản sắc dân tộc. Cùng iVIVU trải nghiệm điểm đến tuyệt vời này ngay hôm nay!

Những trải nghiệm thú vị trong chương trình
- Đảo Nami: hòn đảo nhân tạo xinh đẹp nằm ở ngoại ô Seoul, du khách tìm đến đây để tận mắt ngắm nhìn cảnh sắc thiên nhiên thơ mộng, lãng mạn nhất là con đường nằm giữa hai hàng cây thủy sam.

- Cung điện Kyeongbok: hoàng cung lớn nhất tiêu biểu cho kiến trúc cổ điển và là một công trình tiêu biểu của Hàn Quốc và là cung điện hoàng gia lớn nhất Hàn Quốc.

- Tháp Namsan: cảm nhận được không gian đầy tình yêu thương của những cặp đôi tìm đến đây để treo những chiếc ổ khóa đầy màu sắc biểu tượng cho tình yêu của họ.

- Suối Cheonggyecheon con suối trong mát dài 5.8 km giữa lòng thủ đô Seoul.

- Tháp N Seoul tọa lạc trên núi Namsan và đã trở thành một biểu tượng của Seoul.

- Hero Show một show diễn nghệ thuật vẽ đặc sắc và vui nhộn từ các chàng trai tài hoa.

Bạn có sẵn sàng
Một số điều kiện chung giúp Quý Khách nâng cao tỷ lệ xin Visa Hàn Quốc thành công:

- Đã từng đi du lịch các nước ở khu vực Đông Nam Á.

- Có công việc ổn định và thu nhập tốt

- Có tài sản đứng tên như nhà đất, xe hơi, sổ tiết kiệm...

- Chưa từng bị từ chối visa trước đây

- Tải App PC Covid xác nhận tiêm chủng đủ 2 mũi trở lên.

iVIVU luôn sẵn sàng tư vấn chi tiết cho Quý Khách theo từng trường hợp cụ thể.

Chương trình tour
ƯU ĐÃI ĐẶC BIỆT: GIẢM NGAY 400K/KHÁCH KHI KHÁCH ĐẶT TOUR. ĐIỀU KIỆN: ÁP DỤNG NHÓM 4 KHÁCH TRỞ LÊN.
NGÀY 1: TP.HCM - SEOUL ( NGHỈ ĐÊM TRÊN MÁY BAY)
Quý khách tập trung tại sân bay Tân Sơn Nhất ga đi quốc tế, Trưởng Đoàn hướng dẫn làm thủ tục hàng không cho quý khách đáp chuyến bay đi Hàn Quốc.

NGÀY 2: SEOUL - ĐẢO NAMI - THÁP N SEOUL ( ĂN SÁNG, TRƯA, TỐI)
Đến sân bay Quốc Tế Incheon, hướng dẫn viên đón đoàn chào mừng đoàn đến với Thủ đô Seoul. Để nạp thêm năng lượng sau chuyến bay đêm, đoàn dùng bữa trưa tại nhà hàng địa phương thưởng thức ẩm thực tại Xứ sở Kim chi.

Tiếp đến, Quý khách khởi hành đi tham quan:

- Đảo Nami – Nổi tiếng với những bản màu sắc riêng theo từng mùa: Mùa thu rực rỡ ánh vàng đỏ của tán cây phong và rừng ngân hạnh; Mùa hè có cây cối mướt xanh; Mùa đông huyền ảo với tuyết phủ trắng xóa& cuối cùng đặc biệt là vào Mùa xuânhàng trăm cây hoa anh đào nhuộm sắc hồng rực rỡ, với mùi hương ngọt ngào phảng phất không khí và lànơi ra đời của nhiều bộ phim truyền hình nổi tiếng của Hàn Quốc đã làm dấy lên cơn sốt nghệ thuật thứ bảy tại các nước CHÂU Á và thế giới như: "Bản Tình Ca Mùa Đông".');

CREATE TABLE Tour_Image
(
    tour_img_id int(10)      NOT NULL AUTO_INCREMENT,
    tour_id     int(10)      NULL,
    img_name    varchar(100) null,
    img_url     varchar(100) null,
    PRIMARY KEY (tour_img_id),

    constraint fk_Tour_Image_Tour
        foreign key (tour_id) references Tour (tour_id) on update cascade on delete cascade
);
insert into tour_image (tour_id, img_name, img_url)
values (1,null,'1-ivivu-cung-dien-kyeongbok.jpg'),(1,null,'1-ivivu-dao-nami-mua-he.jpg'),(1,null,'1-ivivu-tour-han-quoc-thap-nam-san.jpg');

create table Tour_Schedule
(
    tour_schedule_id int(10) not null auto_increment,
    tour_id          int(10) not null,
    start_day        date    not null,
    end_day          date    not null,

    primary key (tour_schedule_id),
    constraint fk_Tour_Schedule_Tour
        foreign key (tour_id) references Tour (tour_id) on update cascade on delete cascade
);

insert into tour_schedule (tour_id, start_day, end_day)
values (1,'2023-3-20','2023-3-23');

-- Customer-Tour
create table Booking
(
    booking_id   int(10)        not null auto_increment,
    tour_id      int(10)        not null,
    user_id      int(10)        not null,
    create_at    datetime       not null default CURRENT_TIMESTAMP,
    adult_number int(10)        not null default 1,
    child_number int(10)        not null default 0,
    total_cost   decimal(20, 4) not null default 0,
    status       tinyint        not null default 0,

    primary key (booking_id),
    constraint fk_Booking_Tour
        foreign key (tour_id) references Tour (tour_id) on delete restrict on update cascade,
    constraint fk_Booking_Customer
        foreign key (user_id) references User (user_id) on delete restrict on update cascade

);


create table Hotel
(
    hotel_id   int(10)      not null,
    hotel_name varchar(100) not null,
    address    text         null,
    tel        int(10)      null,
    website    varchar(100) null,
    star       tinyint default 2,
    primary key (hotel_id)
);

insert into hotel ( hotel_name, address, tel, website)
values ('thinh vuong2','11/2/4 tran bui duong p12 dalat',null,null);


create table Place
(
    place_id       int          not null auto_increment,
    place_name     varchar(100) not null default '',
    place_describe text,
    star           tinyint               default 3,
    region         varchar(100) null,
    primary key (place_id)
);
alter table place modify column place_describe text null
insert into place (place_name, place_describe, star, region)
values ('cho dem da lat',null,4,'vietnam/dalat');

create table Sceneric_Cultuer
(
    sc_id       int(10)                 not null auto_increment,
    sc_name     varchar(100) default '' not null,
    place_id    int                     not null,
    sc_describe text                    null,
    img_url     varchar(100)            null,

    primary key (sc_id),
    constraint fk_SC_Place
        foreign key (place_id) references Place (place_id) on update cascade on delete restrict

);
insert into sceneric_cultuer (sc_name, place_id, sc_describe, img_url)
values ('crazy house',1,null,'sceneric/crazy-house.jpg'),
       ('elephant falls',1,null,'sceneric/elephant-falls.jpg'),
       ('linh phuong pagoda',1,null,'sceneric/it-is-know-as-daragon.jpg'),
       ('thien vien truc lam',1,null,'sceneric/the-most-beautiful-pagoda.jpg');

create table Tour_Place
(
    tour_id   int(10) not null,
    place_id  int(10) not null,
    create_at datetime    not null default current_timestamp,

    constraint fk_Tour_Place_Tour
        foreign key (tour_id) references Tour (tour_id) on update cascade on delete restrict,
    constraint fk_Tour_Place_Place
        foreign key (place_id) references Place (place_id) on update cascade on delete restrict
);
insert into tour_place (tour_id, place_id)
values (1,1);


drop table tour_place; drop table sceneric_cultuer