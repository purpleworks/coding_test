require 'rails_helper'

RSpec.describe Booking, type: :model do
  context '유효성검증' do
    it 'name은 필수항목이다' do
      booking = Booking.new
      expect(booking).not_to be_valid
    end

    it 'start_time은 필수항목이다' do
      booking = build(:booking)
      expect(booking).not_to be_valid
    end

    it 'end_time은 필수항목이다' do
      booking = build(:booking)
      expect(booking).not_to be_valid
    end
  end

  context '예약날짜검증' do
    before :each do
      # 2016-01-01 00:00 ~ 2016-01-01 23:59 (1일) 테스트 생성
      booking = create(:booking, start_time: '2016-01-01 00:00', end_time: '2016-01-01 23:59')
      # 2016-01-10 00:00 ~ 2016-01-11 23:59 (2일) 테스트 생성
      booking = create(:booking, start_time: '2016-01-10 00:00', end_time: '2016-01-11 23:59')
    end

    it '동일한 시간에 예약이 있으면 예약이 불가능하다' do
      booking = build(:booking, start_time: '2016-01-01 00:00', end_time: '2016-01-01 23:59')
      expect(booking).not_to be_valid
    end

    # 여기에 추가적인 검증 코드를 작성해주세요.
  end
end
