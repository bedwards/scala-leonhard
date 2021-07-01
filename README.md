# scala-leonhard

Learning Scala by solving a series of challenging mathematical/computer programming problems.

* Credit to projecteuler -dot- net
* Credit to [learnxinyminutes](https://learnxinyminutes.com/)
* Credit to [DockerHub hseeberger/scala-sbt](https://hub.docker.com/r/hseeberger/scala-sbt/)


## Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we
get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
multiples of 3 or 5 below 1000.

    % docker-compose run scala scala One.scala 3 5 10
    23


## Problem 3

The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
factor of the number 600851475143?

    % docker-compose run scala scala Three.scala 13195
    n=13195, factor=5
    n=2639, factor=7
    n=377, factor=13
    n=29, factor=29
    Some(29)
