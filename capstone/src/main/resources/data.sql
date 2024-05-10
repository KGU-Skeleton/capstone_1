-- 배드민턴 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('basic_swing_side_view', 'badminton', true, '1. 오른발을 뒤로 뺀 상태에서 무게중심을 뒤로 둔다. 2. 오른발에 힘을 실어주며 왼발을 들어준다. 3. 무게 중심을 앞으로 옮긴 후 팔을 곧게 펴고 스윙을 한다.', 'src/assets/video/ball_Games/badminton/basic_swing_side_view.mp4'),
    ('jump_swing', 'badminton', true, '1. 무릎을 들고 점프를 뛴다. 2. 점프를 할 때 앞 뒤 발을 바꾸며, 팔을 곧게 펴고 스윙을 한다', 'src/assets/video/ball_Games/badminton/jumpSwingAnalysis.mp4'),
    ('left_backward_motion', 'badminton', true, '1. 왼쪽 뒤로 왼발을 딛는다. 2. 가볍게 점프를 뛰며 왼발을 조금 더 뒤로 이동한다. 3. 오른발을 뒤로 움직이며 점프할 자세를 잡는다. 4. 점프를 할 때 앞 뒤 발을 바꾸며, 팔을 곧게 펴고 스윙을 한다.', 'src/assets/video/ball_Games/badminton/left_backward_motion.mp4'),
    ('side_drive', 'badminton', true, '1. 왼발을 왼쪽으로 한발 이동한다. 2. 오른발을 더 많이 이동하며 네트를 등지는 자세를 취한다. 3. 손등 방향으로 셔틀콕을 치듯이 라켓으로 스윙을 한다.', 'src/assets/video/ball_Games/badminton/side_drive.mp4');

-- 야구 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('basic_swing', 'baseball', true, '1. 양쪽 어깨를 목을 기준으로 회전하듯이 돌리며 배트를 위로 든다 2. 허리와 다리를 반대방향으로 돌리는 동시에 팔을 곧게 펴고 스윙을 한다.', 'src/assets/video/ball_Games/baseball/basic_swing.mp4'),
    ('pitching_front_view', 'baseball', true, '1. 무릎을 가슴 높이 들고, 팔을 얼굴쪽까지 가까이 가져온다. 2. 무릎을 내리며 팔을 멀리 펴서 던질 준비를 한다. 3. 팔을 크게 휘두르며 공을 던진다.', 'src/assets/video/ball_Games/baseball/pitching_front_view.mp4'),
    ('pitching_side_view', 'baseball', true, '1. 무릎을 가슴 높이 들고, 팔을 얼굴쪽까지 가까이 가져온다. 2. 무릎을 내리며 팔을 멀리 펴서 던질 준비를 한다. 3. 팔을 크게 휘두르며 공을 던진다.', 'src/assets/video/ball_Games/baseball/pitching_side_view.mp4');

-- 골프 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('putting', 'golf', true, '1. 팔을 편 상태로 손을 골반 높이까지 올린다 2. 반대편 골반 높이까지 팔을 편 상태로 유지하고 스윙을 한다.', 'src/assets/video/ball_Games/golf/putting.mp4'),
    ('swing', 'golf', true, '1. 양쪽 어깨를 목을 기준으로 회전하듯이 돌리며 골프채를 위로 든다. 2. 허리와 다리를 반대 방향으로 돌리며 팔을 편 상태로 스윙을 한다. 3. 팔을 끝까지 위둘러 공의 진행방향을 쳐다본다.', 'src/assets/video/ball_Games/golf/swing.mp4');

-- 축구 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('liner_kick', 'soccer', true, '1. 무게 중심을 대각선 앞으로 낮춘다. 2. 달려가며 발을 스윙한다. 3. 발을 대각선으로 눕힌 상태로 공을 끝까지 밀어준다.', 'src/assets/video/ball_Games/soccer/liner_kick.mp4'),
    ('pass', 'soccer', true, '1. 무게 중심을 낮추고 발을 옆으로 돌린다. 2. 공을 차며 공을 짧게 밀어준다.', 'src/assets/video/ball_Games/soccer/pass.mp4'),
    ('shooting', 'soccer', true, '1. 무게 중심을 앞으로 둔다. 2. 달려가며 공 옆에 발을 두고 크게 스윙한다. 3. 공을 찬 발을 앞에 짚으며 착지한다.', 'src/assets/video/ball_Games/soccer/shooting.mp4'),
    ('turn', 'soccer', true, '1. 발을 공의 중간 높이로 올려 패스를 받는다. 2. 몸을 돌리며 공을 받은 발을 진행방향 반대편으로 공 뒤에 딛는다. 3. 발로 공을 살짝 밀며 드리블한다.', 'src/assets/video/ball_Games/soccer/turn.mp4');

-- 테니스 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('backhand', 'tennis', true, '1. 공이 오는 방향으로 이동한다. 2. 네트를 등지는 자세를 취하며 라켓을 든다. 3. 라켓을 휘두르며 공을 치는 동시에 허리를 크게 돌린다.', 'src/assets/video/ball_Games/tennis/backhand.mp4'),
    ('forehand', 'tennis', true, '1. 공이 오는 방향으로 이동한다. 2. 자세를 낮추며 공을 받을 준비를 한다. 3. 라켓을 휘두르며 공을 치는 동시에 허리를 크게 돌린다.', 'src/assets/video/ball_Games/tennis/forehand.mp4'),
    ('serve', 'tennis', true, '1. 공을 높게 던진다. 2. 살짝 점프하며 라켓을 크게 스윙한다.', 'src/assets/video/ball_Games/tennis/serve.mp4'),
    ('smash', 'tennis', true, '1. 공이 오는 위치로 이동한다. 2. 몸을 앞으로 이동하며 팔을 크게 스윙한다.', 'src/assets/video/ball_Games/tennis/smash.mp4');

-- 배구 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('basic_serve', 'volleyball', true, '1. 앞으로 이동하며 공을 높게 던진다. 2. 팔을 귀 옆에 붙이며 들어 올린다. 3. 공이 떨어지는 순간 팔꿈치를 고정시키고 팔을 크게 휘두르며 스윙한다. 4. 손꿈치와 손바닥으로 공을 치며 공이 회전한다.', 'src/assets/video/ball_Games/volleyball/basic_serve.mp4'),
    ('floater_serve', 'volleyball', true, '1. 앞으로 이동하며 공을 높게 던진다. 2. 팔을 귀 옆에 붙이며 들어 올린다. 3. 공이 떨어지는 순간 손목을 고정시키고 팔을 크게 휘두르며 스윙한다. 4. 손꿈치로 공을 치며 공이 회전하지 않는다.', 'src/assets/video/ball_Games/volleyball/floater_serve.mp4');

-- 헬스 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('barbell_lunge', 'gym', false, '1. 바벨을 승모근에 걸친다. 2. 오른쪽 or 왼쪽 다리 둘 중 하나를 앞으로 뺀다. 3. 빼지 않은 다리의 무릎을 지면에 닿게 한다. 4. 뺀 다리는 직각을 유지할 정도로 굽혀준다. 이때 상체는 절대 움직이면 안된다.', 'src/assets/video/non_ball_Games/gym/barbell_lunge.mp4'),
    ('barbell_row', 'gym', false, '1. 어깨 너비만큼 바벨을 잡는다. 2. 어깨 관절을 움직이지 않고 팔 각도가 직각이 되는 만큼 바벨을 든다.', 'src/assets/video/non_ball_Games/gym/barbell_row.mp4'),
    ('behind_neck_press', 'gym', false, '1. 바벨을 무릎 넓이 간격만큼 잡고 어깨를 고정시킨 상태에서 올린다. 2. 바벨을 내릴 때 머리 뒤쪽으로 넘긴다. 3. 팔 각도는 직각이 될 때 까지 내린다.', 'src/assets/video/non_ball_Games/gym/behind_neck_press.mp4'),
    ('bentover_dumbbel_curl', 'gym', false, '1. 덤벨을 잡고 어깨를 움직이지 않는 상태에서 끌어올릴 수 있는만큼 올린다.', 'src/assets/video/non_ball_Games/gym/bentover_dumbbell_curl.mp4'),
    ('dumbbel_back_lunge', 'gym', false, '1. 덤벨을 잡고 바른 자세로 일어난다. 2. 런지 자세를 수회 반복하며 운동한다.', 'src/assets/video/non_ball_Games/gym/dumbbell_back_lunge.mp4'),
    ('dumbbel_shoulder_press', 'gym', false, '1. 앉은 상태로 덤벨을 잡는다. 2. 팔을 완전히 곧게 피지 않는 상태까지만 지면과 수직으로 민다.', 'src/assets/video/non_ball_Games/gym/dumbbell_shoulder_press.mp4'),
    ('ez_bar_preacher_curl', 'gym', false, '1. ez bar를 사용해 중간부분을 잡는다. 2. 쿠션에 팔꿈치를 대고 손목을 움직이지 않는다. 3. 그대로 몸쪽으로 잡아당긴다.', 'src/assets/video/non_ball_Games/gym/ez_bar_preacher_curl.mp4'),
    ('front_lateral_raise', 'gym', false, '1. ez bar를 사용해 패인부분을 위쪽으로 향하도록 잡는다. 2. 바른자세로 서서 팔이 몸과 직각이 되도록 반복운동한다.', 'src/assets/video/non_ball_Games/gym/front_lateral_raise.mp4'),
    ('one_arm_dumbbell_row', 'gym', false, '1. 운동하려는 팔과 반대쪽의 다리를 스탠드에 무릎을 대고 올린다. 2. 어깨를 고정시킨다. 3. 팔꿈치가 허리에 닿을때까지 덤벨을 올린다.', 'src/assets/video/non_ball_Games/gym/one_arm_dumbbell_row.mp4'),
    ('push_up', 'gym', false, '1. 어깨 넓이보다 1.5배 더 벌린 상태로 엎드린다. 2. 가슴과 지면의 간격이 주먹 하나가 들어갈 정도로 천천히 내려간다.', 'src/assets/video/non_ball_Games/gym/push_up.mp4'),
    ('side_lateral_raise', 'gym', false, '1. 앉은 상태로 덤벨을 잡는다. 2. 손목과 팔을 약 15도 꺾는다. 3. 지면과 수직으로 팔을 들어올린다. 이때 어깨 이상으로 올라가면 안된다.', 'src/assets/video/non_ball_Games/gym/side_lateral_raise.mp4'),
    ('squat', 'gym', false, '1. 상체의 움직임을 최소화한다. 2. 골반을 뒤로 빼며 천천히 무릎을 굽힌다. 3. 무릎의 각도가 직각 이하로 되지 않도록 주의한다.', 'src/assets/video/non_ball_Games/gym/squat.mp4'),
    ('stiff_legged', 'gym', false, '1. 허리를 곧게 세운 상태로 골반을 뒤로 빼면서 내려간다. 2. 들고있는 바벨이 지면에 닿을 때 까지 내려간다.', 'src/assets/video/non_ball_Games/gym/stiff_legged.mp4'),
    ('T_barrow', 'gym', false, '1. 다리와 허리가 직각이 되도록 숙이고 무릎을 15도 가량 굽힌다. 2. 어깨를 고정시킨다. 3. 덤벨로우와 같이 팔꿈치가 허리까지만 올라오도록 바벨을 당긴다.', 'src/assets/video/non_ball_Games/gym/T_barrow.mp4'),
    ('wide_squat', 'gym', false, '1. 다리를 어깨 넓이보다 1.5배 더 넓게 벌린다. 2. 골반을 뒤로 빼며 상체는 움직이지 않는다. 3. 무릎이 직각이 될 때까지만 내려간다.', 'src/assets/video/non_ball_Games/gym/wide_squat.mp4');

-- 태권도 동작
INSERT INTO explain (movement, sport, ball, explain, video_url)
VALUES
    ('fist_jireugi', 'taekwondo', false, '1. 다리를 어깨 넓이보다 1.5배 더 넓게 벌린다. 2. 주먹을 쥐고 허리에 양 손을 올린다. 3. 손 등이 위로 가도록 팔을 회전시키며 앞으로 주먹을 뻗는다.', 'src/assets/video/non_ball_Games/taekwondo/fist_jireugi.mp4'),
    ('huryeochagi', 'taekwondo', false, '1. 앞발을 시계방향으로 틀어 발뒤꿈치가 정면을 향하도록 한다. 2. 뒷발의 무릎을 접은 채 45도로 들어올려 발바닥이 정면을 향하게 한다. 3. 타격 지점에서 다리를 펴 뒤꿈치로 가격한다.', 'src/assets/video/non_ball_Games/taekwondo/huryeochagi.mp4'),
    ('naraekick', 'taekwondo', false, '1. 앞으로 뛰어나가며 뒷발을 찬 후 점프한다. 2. 그대로 골반을 반대방향으로 돌리며 앞발로 가격한다.', 'src/assets/video/non_ball_Games/taekwondo/naraekick.mp4'),
    ('shinkick', 'taekwondo', false, '1. 본인이 차려고 하는 발을 뒤로 뺀다. 2. 반대 발을 축으로 골반을 틀며 앞으로 발을 찬다. 3. 균형을 유지하며 찬 발을 착지한다.', 'src/assets/video/non_ball_Games/taekwondo/shinkick.mp4'),
    ('sidekick', 'taekwondo', false, '1. 뒷발을 앞으로 빼며 골반을 앞발 방향으로 돌린다. 2. 발목을 피고 무릎을 핀 상태로 찬다.', 'src/assets/video/non_ball_Games/taekwondo/sidekick.mp4');


