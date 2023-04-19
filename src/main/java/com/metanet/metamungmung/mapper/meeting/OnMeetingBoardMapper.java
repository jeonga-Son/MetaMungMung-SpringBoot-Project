package com.metanet.metamungmung.mapper.meeting;


import com.metanet.metamungmung.dto.meeting.OffMeetingMemDTO;
import com.metanet.metamungmung.dto.meeting.OnMeetingBoardDTO;
import com.metanet.metamungmung.dto.meeting.OnMeetingMemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OnMeetingBoardMapper {
    // 게시글 목록 조회
    public List<OnMeetingBoardDTO> getBoardList(Long onMeetingIdx);

    // 온 모임 가입한 사람 리스트
    public List<OnMeetingMemDTO> getOnMeetingMembers(Long onMeetingIdx);

    // 온 모임 가입한 전체 인원 수
    public int getOnMeetingMembersCnt(Long onMeetingIdx);



    // 게시글 상세 조회

    // 게시글 작성

    // 게시글 수정

    // 게시글 삭제

    // 게시글 검색
}
