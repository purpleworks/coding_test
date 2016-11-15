class Booking < ApplicationRecord
  enum status: { ready: 0, accepted: 1, canceled: 2 }

  # 여기에 코드를 작성하세요
end
