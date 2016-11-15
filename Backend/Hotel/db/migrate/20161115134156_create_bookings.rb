class CreateBookings < ActiveRecord::Migration[5.0]
  def change
    create_table :bookings do |t|
      t.string   :name
      t.datetime :start_time
      t.datetime :end_time
      t.integer  :status
      t.timestamps
    end
  end
end
