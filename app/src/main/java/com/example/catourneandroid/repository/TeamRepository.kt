package com.example.catourneandroid.repository

import com.example.catourneandroid.database.dao.TeamDao
import com.example.catourneandroid.database.entity.TeamEntity

class TeamRepository(private val teamDao: TeamDao) {

    suspend fun getAllTeams(): List<TeamEntity> =
        teamDao.getAllTeams()

    suspend fun getTeamById(teamId: Int): TeamEntity? {
        return teamDao.getTeamById(teamId)
    }

    // Function to insert a new team
    suspend fun insertTeam(team: TeamEntity) {
        teamDao.insertTeam(team)
    }

    suspend fun updateTeam(team: TeamEntity) {
        val teamId = team.idTeam
        val newPosition = team.positionTeam
        teamDao.updateTeamById(teamId, newPosition)
    }
}