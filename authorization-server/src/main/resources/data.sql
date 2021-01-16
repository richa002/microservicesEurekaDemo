INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope,
 access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information)
  VALUES ('mobile', '$2a$04$OWaSdiyQqw.BEiq9k0u/f.LKHAh1852VSmBYX7InBPGxbUXCZfuhK',
   'http://localhost:8080/login', 'READ,WRITE', '3600', '10000', 'inventory,payment',
    'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO permission (NAME) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT INTO role (NAME) VALUES
		('ROLE_admin'),('ROLE_operator'),('ROLE_editor');

 INSERT INTO permission_role (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read operator */
     (2,3),  /* read editor */
     (3,3) ; /*  update editor*/
insert into user (id, username,password, email, enabled, account_non_expired, credentials_non_expired, account_non_locked)
VALUES ('1', 'richa','$2a$04$OWaSdiyQqw.BEiq9k0u/f.LKHAh1852VSmBYX7InBPGxbUXCZfuhK', 'k@krishantha.com', '1', '1', '1', '1');
 insert into  user (id, username,password, email, enabled, account_non_expired, credentials_non_expired, account_non_locked)
 VALUES ('2', 'naisha', '$2a$04$OWaSdiyQqw.BEiq9k0u/f.LKHAh1852VSmBYX7InBPGxbUXCZfuhK','k@krishantha.com', '1', '1', '1', '1');
insert into  user (id, username,password, email, enabled, account_non_expired, credentials_non_expired, account_non_locked)
 VALUES ('3', 'tarun', '$2a$04$OWaSdiyQqw.BEiq9k0u/f.LKHAh1852VSmBYX7InBPGxbUXCZfuhK','k@krishantha.com', '1', '1', '1', '1');

INSERT INTO role_user (ROLE_ID, USER_ID)
    VALUES
    (1, 1) /* richa-admin */,
    (2, 2) ,
    (3,3);/* naisha-operator */
    /* also added tarun as editor having same password and read and update permission in database manuualy*/