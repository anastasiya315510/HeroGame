package hero

 class GameManager(hero:Hero, hero1:Hero) {
def fight:Unit= {
  while (hero1.isAlive && hero.isAlive) {
    hero1.kick(hero)
    hero.kick(hero1)

  }
  if (!hero1.isAlive) {
    print(s"${hero} is winner, ${hero1} lose")
  } else {
    print(s"${hero1} is winner, ${hero} lose")
  }

}

}
