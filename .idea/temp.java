@Test
    void 공동_우승자_선정_기능_확인() {
            racingGame.getCars().get(0).moveForward();
            racingGame.getCars().get(1).moveForward();
            assertThat(racingGame.getWinners()).isEqualTo(List.of("car1", "car2"));
            }

@Test
    void 단일_우승자_선정_기능_확인() {
            racingGame.getCars().get(0).moveForward();
            assertThat(racingGame.getWinners()).isEqualTo(List.of("car1"));